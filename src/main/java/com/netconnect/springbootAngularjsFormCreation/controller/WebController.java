package com.netconnect.springbootAngularjsFormCreation.controller;

/**
 * author anand.
 * since on 24/5/18.
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    @GetMapping(value="/")
    public String homepage(){
        return "index";
    }
}