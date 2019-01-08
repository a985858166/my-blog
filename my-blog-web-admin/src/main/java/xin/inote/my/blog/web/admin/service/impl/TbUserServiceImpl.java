package xin.inote.my.blog.web.admin.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;
import xin.inote.my.blog.commons.constant.ConstantUtils;
import xin.inote.my.blog.commons.dto.BaseResult;
import xin.inote.my.blog.domain.TbUser;
import xin.inote.my.blog.web.admin.abstracts.AbstractsBaseServiceImpl;
import xin.inote.my.blog.web.admin.dao.TbUserDao;
import xin.inote.my.blog.web.admin.service.TbUserService;

import javax.servlet.http.HttpServletRequest;

@Service
public class TbUserServiceImpl extends AbstractsBaseServiceImpl<TbUser, TbUserDao> implements TbUserService {

    @Override
    public BaseResult login(HttpServletRequest httpServletRequest, TbUser tbUser) {
        //获取邮箱或用户名的用户信息
        TbUser tbUserDB = dao.login(tbUser);
        if (tbUserDB!=null){
            //把密码加密
            String password = DigestUtils.md5DigestAsHex(tbUser.getPassword().getBytes());
            //密码正确
            if (tbUserDB.getPassword().equals(password)){
                //储存用户信息
                httpServletRequest.getSession().setAttribute(ConstantUtils.SESSION_USER,tbUserDB);
                return BaseResult.success();
            }
        }
        return BaseResult.fail("用户名或密码错误，请重新登陆");
    }
}
