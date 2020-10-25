package io.maha.springsecuritydemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/")
    public String welcome (){
        return "<h1>Welcome</h1><br><a href='/logout'>logout</a>";
    }

    @GetMapping("/user")
    public String user (){
        return "<h1>Welcome User</h1><br><a href='/logout'>logout</a>";
    }

    @GetMapping("/admin")
    public String admin (){
        return "<h1>Welcome Admin</h1><br><a href='/logout'>logout</a>";
    }
}
