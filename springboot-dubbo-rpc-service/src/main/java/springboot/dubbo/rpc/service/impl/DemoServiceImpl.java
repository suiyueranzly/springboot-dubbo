package springboot.dubbo.rpc.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import springboot.dubbo.rpc.api.DemoService;

/**
 * Created by zhangyq on 2018/3/22.
 */
@Service(
        version = "1.0.0",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello() {
        return "hello";
    }
}
