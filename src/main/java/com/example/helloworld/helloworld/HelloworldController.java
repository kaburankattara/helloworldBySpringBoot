package com.example.helloworld.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloworldController {

    private HelloworldService helloworldService;

    public HelloworldController(@Autowired HelloworldService helloworldService) {
        this.helloworldService = helloworldService;
    }

    @ResponseBody
    @GetMapping
    public String index() {
        return helloworldService.getString();
    }
}
