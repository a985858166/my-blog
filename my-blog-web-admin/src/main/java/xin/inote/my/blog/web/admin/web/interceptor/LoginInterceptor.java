package xin.inote.my.blog.web.admin.web.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import xin.inote.my.blog.commons.constant.ConstantUtils;
import xin.inote.my.blog.domain.TbUser;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //获取登陆信息
        TbUser tbUser = (TbUser)request.getSession().getAttribute(ConstantUtils.SESSION_USER);
        //未登录
        if (tbUser == null){
            response.sendRedirect("/login");
        }
        //已登录 放行
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
