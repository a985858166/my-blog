package xin.inote.my.blog.web.admin.web.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import xin.inote.my.blog.commons.constant.ConstantUtils;
import xin.inote.my.blog.domain.TbUser;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PermissionInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        //首先判断是否有传输页面，然后判断是否以login结尾。
            if (modelAndView != null && modelAndView.getViewName() != null && modelAndView.getViewName().endsWith("login")){
                TbUser tbUser = (TbUser) request.getSession().getAttribute(ConstantUtils.SESSION_USER);
                //判断是否以登陆。
                if (tbUser != null){
                    //以登陆则跳到首页
                    response.sendRedirect("/dashboard");
                }
            }
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
