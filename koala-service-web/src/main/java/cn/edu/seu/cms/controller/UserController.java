package cn.edu.seu.cms.controller;

import cn.edu.seu.cms.service.UserService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zxsky on 2016/8/17.
 * Description:
 */
@RestController
public class UserController {

    @Reference(version = "1.0.0")
    private UserService userService;

    @RequestMapping(value = {"/", "/index"})
    public String index() {
        return userService.sayHello("Dubbo");
    }
}
