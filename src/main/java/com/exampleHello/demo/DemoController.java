package com.exampleHello.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class DemoController {

    @PostMapping("/postData")
    public String postData(@RequestBody Map<String,String> body){
//        System.out.println(body.get("name"));
        return "Hello " + body.get("name");
    }

}
