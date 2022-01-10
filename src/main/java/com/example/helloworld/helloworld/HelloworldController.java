package com.example.helloworld.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloworldController {

    @GetMapping
    public String index() {
        return "helloworld";
    }
}
