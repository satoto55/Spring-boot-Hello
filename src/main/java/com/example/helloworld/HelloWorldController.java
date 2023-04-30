package com.example.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    private final String JAPAN = "jp";
    private final String UNITED_STATE = "us";
    private final String FRANCE = "fr";
    private final String UNITED_KINGDOM = "gb";

    @GetMapping("/hello")
    public String hello(@RequestParam("country") String country) {

        return switch (country) {
            case JAPAN -> "こんにちは";
            case UNITED_STATE -> "Hello";
            case FRANCE -> "Bonjour";
            case UNITED_KINGDOM -> "Good afternoon";
            default -> "other";
        };
    }
}
