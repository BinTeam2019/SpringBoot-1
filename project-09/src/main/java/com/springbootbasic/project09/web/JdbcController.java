package com.springbootbasic.project09.web;

import com.springbootbasic.project09.server.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping(value = "/jdbc")
public class JdbcController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String create(){
        userService.create("t5",12, "cs", "1");
        return "success";
    }

}
