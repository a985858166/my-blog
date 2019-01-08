package xin.inote.my.blog.web.admin.service;

import xin.inote.my.blog.commons.dto.BaseResult;
import xin.inote.my.blog.commons.persistence.BaseService;
import xin.inote.my.blog.domain.TbUser;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface TbUserService extends BaseService<TbUser> {
    BaseResult login(HttpServletRequest httpServletRequest, TbUser tbUser);
}
