package com.levelup;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/welcome")
public class TestController {

    @RequestMapping(method = RequestMethod.GET)
    public String showHello(ModelMap model){
        model.addAttribute("message", "Hi");
        return "hello";
    }

}
