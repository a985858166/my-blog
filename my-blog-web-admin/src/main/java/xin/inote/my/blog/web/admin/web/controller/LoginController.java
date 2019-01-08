package xin.inote.my.blog.web.admin.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import xin.inote.my.blog.commons.dto.BaseResult;
import xin.inote.my.blog.domain.TbUser;
import xin.inote.my.blog.web.admin.service.TbUserService;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {
    @Autowired
    private TbUserService tbUserService;
    @ModelAttribute
    public TbUser getTbUser(Integer id){
        TbUser tbUser = null;
        if (id != null){
            tbUser = tbUserService.getById(id);
        }else {
            tbUser = new TbUser();
        }
        return tbUser;
    }
    @RequestMapping(value = {"","login"},method = RequestMethod.GET)
    public String login(){
        return "login";
    }
    @RequestMapping(value = {"","login"},method = RequestMethod.POST)
    public String login(TbUser tbUser, HttpServletRequest httpServletRequest, Model model){
        BaseResult baseResult = tbUserService.login(httpServletRequest,tbUser);
        //登陆成功
        if (baseResult.getStatus() == BaseResult.STATUS_SUCCESS){
            return "redirect:/dashboard";
        }
        //登陆失败
        else {
            model.addAttribute("baseResult",baseResult);
            return login();
        }
    }
}
