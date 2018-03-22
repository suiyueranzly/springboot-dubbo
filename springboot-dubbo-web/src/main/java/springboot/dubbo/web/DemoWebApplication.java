package springboot.dubbo.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by zhangyq on 2018/3/22.
 */
@SpringBootApplication(scanBasePackages = "springboot.dubbo.web.controller")
public class DemoWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoWebApplication.class,args);
    }
}
