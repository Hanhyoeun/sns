package com.fastcampus.sns.controller;

import com.fastcampus.sns.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private UserService userService;

    // TODO: implement
    @PostMapping
    public void join(){
        // JOIN
//        userService.join();

    }
}
