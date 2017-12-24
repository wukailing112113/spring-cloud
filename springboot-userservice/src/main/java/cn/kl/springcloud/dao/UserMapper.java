package cn.kl.springcloud.dao;

import cn.kl.springcloud.enty.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * dao层实现，主要是对数据库的增删改查
 * 使用注解的方式来代替XML的方式。sql写在这里
 * Created by Administrator on 2017/12/24.
 */
public interface UserMapper {

    @Select("select * from user")
    public List<User> getAllUser();
}
