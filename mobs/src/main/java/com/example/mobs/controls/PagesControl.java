package com.example.mobs.controls;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class PagesControl {
    
    @RequestMapping("/")
    public String hi()
    {
        return "hi";
    }


    @GetMapping("/battle")
    public String battle()
    {
        return "battle from spring";
    }
}
