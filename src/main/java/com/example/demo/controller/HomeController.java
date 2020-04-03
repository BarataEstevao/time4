package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @GetMapping("/")
    public ModelAndView index(){
        ModelAndView model = new ModelAndView("index");
        model.addObject("message", "Hello Yose");
        return model;
    }

    @GetMapping("/contactme")
    public ModelAndView contactMe(){

        ModelAndView model = new ModelAndView("contactme");
        return model;
    }

    @GetMapping("/astroport")
    public ModelAndView astrop(){

        ModelAndView model7 = new ModelAndView("astroport");
        return model7;
    }

    @GetMapping("/")
    public ModelAndView readme(){

        ModelAndView model2 = new ModelAndView("readme");
        return model2;
    }


}
