package com.springbootbasic.project10.web;

import com.springbootbasic.project10.domain.entity.Temp;
import com.springbootbasic.project10.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    UserRepository userRepository;

    @RequestMapping(value = "/findByName", method = RequestMethod.GET)
    public String findByName(){
        Temp t = userRepository.findByName("1");
        return t.getName();
    }
}
