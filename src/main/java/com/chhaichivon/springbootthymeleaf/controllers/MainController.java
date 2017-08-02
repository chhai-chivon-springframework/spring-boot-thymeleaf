package com.chhaichivon.springbootthymeleaf.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * AUTHOR : CHHAI CHIVON
 * EMAIL  : chhaichivon1995@gmail.com
 * DATE   : 8/2/2017
 * TIME   : 4:51 PM
 */
@Controller
public class MainController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
