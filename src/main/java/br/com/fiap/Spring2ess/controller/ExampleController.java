package br.com.fiap.Spring2ess.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/example")
public class ExampleController {

    @GetMapping
    public String sayHello() {
        return "Hello, World!";
    }

    @GetMapping("/hello")
    public String sayMyName(@RequestParam(required = false) String name) {
        return String.format("Hello, %s", name);
    }
}