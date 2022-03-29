package com.example.jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String test(){
        return "젠킨스 성공";
    }

    @GetMapping("/jenkins")
    public String tests(){
        return "젠킨스 성공2";
    }

    @GetMapping("/jenkins/id")
    public String test3(){
        return "젠킨스 성공3";
    }

    @GetMapping("/jenkins/test")
    public String test4(){
        return "젠킨스 성공4";
    }
}
