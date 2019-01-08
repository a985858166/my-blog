package xin.inote.my.blog.web.admin.dao;

import xin.inote.my.blog.commons.persistence.BaseDao;
import xin.inote.my.blog.domain.TbUser;

import java.util.List;

public interface TbUserDao extends BaseDao<TbUser> {
    TbUser login(TbUser tbUser);
}
