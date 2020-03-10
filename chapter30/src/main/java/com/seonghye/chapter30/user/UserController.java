package com.seonghye.chapter30.user;

import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @GetMapping("/hello")
    public String hello() { //String을 return 하면 String convert가 동작
                            // pulic @ResponseBody String hello() 와 동일하다 --> @RestController 이기 떄문
        return "hello";
    }

    @PostMapping("/user/create")
    public User create(@RequestBody User user) {
        return user;
    }
}
