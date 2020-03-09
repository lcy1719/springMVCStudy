package com.cy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
   @RequestMapping(value = "/t1/add/{a}/{b}",method = RequestMethod.GET)
    public String he(Model model,@PathVariable(value = "a")int a,@PathVariable(value = "b") int b){
        model.addAttribute("msg",a+b);
        return "hello";
    }

    @RequestMapping(value = "/t2/add",method = RequestMethod.GET)
    public String he1(Model model,int a,int b)
    {

        model.addAttribute("msg",a+b+200);
        return "hello";
    }

    @RequestMapping(value = "t3/add",method = RequestMethod.GET)
    public String he2(Model model, @RequestParam(value = "num1") int a,@RequestParam(value = "num2") int b)
    {
        model.addAttribute("msg",a+b+100);
        return "hello";
    }
}
