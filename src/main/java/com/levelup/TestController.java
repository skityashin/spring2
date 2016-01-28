package com.levelup;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/welcome")
public class TestController {

    @RequestMapping(method = RequestMethod.GET)
    public String showHello(Model model){
        model.addAttribute("message", "Hi");
        return "hello";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/login")
    public String showForm(Model model){
        model.addAttribute("login_user", new User());
        return "login";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/login")
    public String showResult(Model model, @ModelAttribute User user){
        model.addAttribute("login_user", user);
        return "result";
    }

}
