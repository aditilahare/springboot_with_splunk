package com.tw.springboot_with_splunk.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/foo")
    public String foo() {
        return "foo";
    }


    @GetMapping(value = "/user/{id}")
    public String fetchUser(@PathVariable Integer id){
        System.out.println("Printing inside provider " + id);
        return userService.fetchUser();
    }

}
