package springboot.dubbo.web.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springboot.dubbo.rpc.api.DemoService;

/**
 * Created by zhangyq on 2018/3/22.
 */
@RestController
public class DemoController {
    @Reference(
            version = "1.0.0",
            application = "${dubbo.application.id}",
            interfaceClass = DemoService.class
    )
    private DemoService demoService;
    @GetMapping("/index")
    public String index(){
        return demoService.sayHello();
    }
}
