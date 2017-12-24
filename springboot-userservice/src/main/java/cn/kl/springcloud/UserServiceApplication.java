package cn.kl.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**MapperScan 注解扫描dao层接口
 * Created by Administrator on 2017/12/24.
 */
@SpringBootApplication
@MapperScan("cn.kl.springcloud.dao")
public class UserServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class,args);
    }
}
