package cn.kl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**使用feign来调用服务，类似于调用本地方法一样调用服务
 * 调用服务的两种方式：feign和restTemplate
 * feign底层还是调用了java connectionURL
 * Created by Sawyer on 2017/12/22.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class FeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeignApplication.class);
    }
}
