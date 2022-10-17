package com.example.miniserv_lab;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController()
@RequestMapping("stassService/")
public class ControllerStass {
    @GetMapping("/")
    public String home() {
        return MiniservLabApplication.S.stass.toString();
    }

    @PostMapping("/")
    public String home(@ModelAttribute String s) {
        MiniservLabApplication.S.stass.add(s);
        return MiniservLabApplication.S.stass.toString();
    }
}