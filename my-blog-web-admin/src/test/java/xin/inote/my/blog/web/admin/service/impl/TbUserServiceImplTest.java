package xin.inote.my.blog.web.admin.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import xin.inote.my.blog.domain.TbUser;
import xin.inote.my.blog.web.admin.service.TbUserService;

import java.util.Date;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-context.xml", "classpath:spring-context-druid.xml", "classpath:spring-context-mybatis.xml"})
public class TbUserServiceImplTest {
    @Autowired
    TbUserService tbUserService;
    @Test
    public void getById() {
        TbUser tbUser = tbUserService.getById(2);
        System.out.println(tbUser);
    }

    @Test
    public void insert() {
        TbUser tbUser = new TbUser();
        tbUser.setEmail("784738@qq.com");
        tbUser.setScreenName("测试");
        tbUser.setUsername("test");
        tbUser.setPassword("123456");
        tbUser.setCreated(new Date());
        tbUser.setUpdated(new Date());
        tbUserService.insert(tbUser);
    }

    @Test
    public void delete() {
        tbUserService.delete(2);
    }

    @Test
    public void selectAll() {
    }

    @Test
    public void update() {
        TbUser tbUser = tbUserService.getById(3);
        tbUser.setScreenName("厉害了");
        tbUserService.update(tbUser);
    }

    @Test
    public void deleteMulti() {
    }
}
