package com.jake.SpringIntro.controller;

import com.jake.SpringIntro.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;

@Controller
public class introController {

    @RequestMapping("/")
    //@ResponseBody
    public String homePage(){
        return "index";
    }

@RequestMapping("/person")
    public String personPage(ModelMap modelMap){
        User user = new User("Jake", "awesomeJake", LocalDate.of(1995, 04,26));
        modelMap.put("user", user);
        return "user";
}

}
