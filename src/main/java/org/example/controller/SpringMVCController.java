package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/springmvc")
public class SpringMVCController {
    @GetMapping("/test")
    public Map<String, String> test() {
        System.out.println("------- accessed ------");
        return Map.of("test", "hello world");
    }
}
