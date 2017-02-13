package com.ysc.info.controller;


import com.ysc.info.entity.User;
import com.ysc.info.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private IUserService userService;

    @RequestMapping("/showUser")
    public String toIndex(HttpServletRequest request,Model model){
        String userName = request.getParameter("userName");
        User user = this.userService.getUserById(userName);
        model.addAttribute("user", user);
        return "showUser";
    }
}