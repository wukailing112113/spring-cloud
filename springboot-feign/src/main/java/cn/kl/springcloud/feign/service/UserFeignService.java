package cn.kl.springcloud.feign.service;

import cn.kl.springcloud.enty.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


/** 参考：http://xujin.org/sc/sc-fegin01/
 *  在spring cloud 中使用Feign就相当于使用 http来请求远程服务的作用是一样的。只不过是Feign就像调用本地方法一样来试用，不需要建立http远程
 *  请求，这些都是spring cloud来帮我们做了。
 *  @FeignClient 用于通知Feign组件对该接口进行代理，因此该接口不需要实现类。调用的时候直接通过注入的方式@Autowired来注入接口，即可调用该接口的方法
 *  @FeignClient(name = "USER-SERVICE") name属性指定要调用哪个服务
 *  @RequestMapping(value = "/user/list",method = RequestMethod.GET) 方法的映射是要根据服务提供者USER-SERVICE提供的接口来一一对应的，如服务端有个请求为/user/list
 *  方法返回的类型如User。这里需要注意下，返回类型即可以是依赖服务提供者暴露的jar包，如这里直接引用了 工程springboot-userservice 的enty包下的User类。也可以在消费者这个
 *  项目下，即springboot-feign这里建立一个User类对象，字段属性与服务提供者返回的对象数据要一致，这样的话返回的数据是可以相互转换的。
 *  如方法 List<User> getAllUser(); 假如这里的User是springboot-feign工程下User的类，服务提供的接口/user/list返回的是工程springboot-userservice 的enty包下的User类
 *  此时也是可以相互转换的.
 * Created by kling on 2017/12/22.
 */
@FeignClient(name = "USER-SERVICE")
public interface UserFeignService {

    /**
     * 获取用户集合
     * @return
     */
    @RequestMapping(value = "/user/list",method = RequestMethod.GET)
    public List<User> getAllUser();

    /**
     * 删除用户
     * @param id
     * @return
     */
    @RequestMapping(value = "/user/delete/{id}")
    public String deleteUser(@PathVariable("id") Integer id);
}
