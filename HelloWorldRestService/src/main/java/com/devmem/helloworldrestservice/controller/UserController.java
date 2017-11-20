package com.devmem.helloworldrestservice.controller;

import com.devmem.helloworldrestservice.beans.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/rest/user")
public class UserController {

    private final String HELLO_TEMPLATE = "Hello %s";

    @RequestMapping(
            value = "/hello",
            method = RequestMethod.GET,
            produces = "application/json"
    )
    public User sayHello(@RequestParam(value = "name") String name) {
        return new User(String.format(HELLO_TEMPLATE, name));
    }

}
