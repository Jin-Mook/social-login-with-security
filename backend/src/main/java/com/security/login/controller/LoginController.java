package com.security.login.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class LoginController {

    @GetMapping("/")
    public String main() {
        return "main";
    }

    @PostMapping("/check/kakao/login")
    public Boolean checkKakao(@RequestBody String jwt) {
        log.info("jwt = {}", jwt);
        return jwt.equals("jwt-token");
    }
}
