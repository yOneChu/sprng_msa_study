package com.example.secondservice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class SecondServiceController {

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to the Second service";
    }
}
