package xin.inote.my.blog.web.admin.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DashboardController {
    @RequestMapping(value = "dashboard",method = RequestMethod.GET)
    public String dashboard(){
        return "dashboard";
    }
}