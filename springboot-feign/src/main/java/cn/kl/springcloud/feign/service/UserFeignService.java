package cn.kl.springcloud.feign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/** 参考：http://xujin.org/sc/sc-fegin01/
 *
 * Created by kling on 2017/12/22.
 */
@FeignClient(name = "server-name")
public interface UserFeignService {

//    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
//    public User findUserById(@PathVariable("id") Integer id);
}
