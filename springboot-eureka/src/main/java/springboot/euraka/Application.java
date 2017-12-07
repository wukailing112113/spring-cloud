package springboot.euraka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/** 程序入口http://localhost:222   （配置文件指定使用222端口）
 * 服务注册中心，个人觉得作用类似zookeeper。 暂且理解  》》》 服务消费者和提供者都到这里来获取服务的意思吧
 * Created by Sawyer on 2017/11/22.
 */
@EnableEurekaServer
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
