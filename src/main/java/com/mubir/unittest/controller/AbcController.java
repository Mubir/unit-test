package com.mubir.unittest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AbcController {
    @GetMapping("/echo")
    public String Echo()
    {
        return "hello can you hear me";
    }
}
