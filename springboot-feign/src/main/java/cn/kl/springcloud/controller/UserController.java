package cn.kl.springcloud.controller;

import cn.kl.springcloud.enty.User;
import cn.kl.springcloud.feign.service.UserFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Sawyer on 2017/12/22.
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    UserFeignService userFeignService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<User> getAllUsers(){
        return userFeignService.getAllUser();
    }
}
