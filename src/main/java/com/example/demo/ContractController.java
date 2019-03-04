package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ContractController {

    @PostMapping("/test")
    public Map<String, String> test(@RequestBody(required = false) Request request) {
        Map<String, String> result = new HashMap<>();
        result.put("status", "RESPONSE");
        return result;
    }
}
