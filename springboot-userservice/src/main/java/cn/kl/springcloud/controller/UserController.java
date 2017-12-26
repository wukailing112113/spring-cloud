package cn.kl.springcloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Sawyer on 2017/12/22.
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test(){
        return "hello";
    }
}
