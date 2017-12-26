package cn.kl.springcloud.service.impl;

import cn.kl.springcloud.dao.UserMapper;
import cn.kl.springcloud.enty.User;
import cn.kl.springcloud.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/12/24.
 */
@Service("userService")
public class UserServiceImpl implements IUserService {


    private static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> getAllUser() {
        logger.info("查询所有用户的信息");
        return userMapper.getAllUser();
    }
}
