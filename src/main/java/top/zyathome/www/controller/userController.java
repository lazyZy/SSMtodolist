package top.zyathome.www.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import top.zyathome.www.entity.userEntity;
import top.zyathome.www.service.userService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class userController {
    @Resource
    private userService userservice;

    @RequestMapping("/showUser")
    public String toIndex(HttpServletRequest request, Model model){
        int userId = Integer.parseInt(request.getParameter("id"));
        userEntity user = this.userservice.getUserById(userId);
        model.addAttribute("user", user);
        return "showUser";
    }
}