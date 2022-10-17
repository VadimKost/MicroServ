package com.example.miniserv_lab;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("vadimService/")
public class Controller {
    @GetMapping("/")
    public String home() {
        return MiniservLabApplication.S.vadim.toString();
    }

    @PostMapping("/")
    public String home(@RequestParam String s) {
        System.out.println(s);
        MiniservLabApplication.S.vadim.add(s);
        return MiniservLabApplication.S.vadim.toString();
    }
}
