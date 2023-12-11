package com.example.ComEng.ComEngdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@ResponseBody
public class Hello {


    @RequestMapping("/")
    public String hello(){
       String htmlPage="<h1> My Web Page </h1>";
       htmlPage+="<p>About Me </p>";
       htmlPage +="<a href=\"about\"> About ME </a>";
        return htmlPage;
    }

    @RequestMapping("/about")
    public String about(){

        return "Mustafa Cem KASAPBAŞI- bir garip Trabzonlu fani";
    }



}
