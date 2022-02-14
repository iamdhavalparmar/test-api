package com.exampleHello.demo;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class DemoController {

    @PostMapping("/postData")
    public String postData(@RequestBody Map<String,String> body){
//        System.out.println(body.get("name"));
        return "Hello " + body.get("name");
    }

    @GetMapping("/getData")
    @ResponseBody
    public String getData(){return "Hello from server";}
}
