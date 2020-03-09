package com.cy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AjaxController {
    @RequestMapping("/t1")
    public String get() {
        return "hello";
    }

    @RequestMapping("/a")
    public String geat(String name,String password) {
        if(name!="") {
            if (name.equals("123")) {
                if(password!="") {
                    if (password.equals("123")) {
                        return "true";
                    }else{
                        return "false";
                    }
                }else{
                    return "passwordnull";
                }
            } else {
                return "usernamecuowu";
            }
        }else {
            return "null";
        }
    }
}
