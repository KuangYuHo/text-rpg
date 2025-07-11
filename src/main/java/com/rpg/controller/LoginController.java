package com.rpg.controller;

import com.rpg.model.User;
import com.rpg.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String login() {
        return "login";
    }


    @GetMapping("/register")
    public String register(Model model, HttpServletRequest request) {
        System.out.println("register controller 被呼叫：" + request.getMethod());
        model.addAttribute("user", new User());
        return "register";
    }


    @PostMapping("/doRegister")
    public String doRegister(@ModelAttribute User user, Model model) {
        if(userService.findByUsername(user.getUsername()) != null){
            model.addAttribute("error","已有此帳號!");
            return "register";
        }
        userService.registerUser(user);
        System.out.println("註冊成功");
        return "redirect:/login";
    }

    @GetMapping("/home")
    public String home() {
        return "home";
    }





}
