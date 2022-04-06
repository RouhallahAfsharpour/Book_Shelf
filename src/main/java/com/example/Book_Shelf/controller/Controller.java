package com.example.Book_Shelf.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
@RequestMapping("/")
public class Controller{

    @GetMapping
    public String openIndex(){
        return "index";
    }
}
