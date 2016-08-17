package cn.edu.seu.cms.service.impl;

import cn.edu.seu.cms.service.UserService;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * Created by zxsky on 2016/8/17.
 * Description:
 */
@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {

    public String sayHello(String name) {
        return "Hello " + name;
    }
}
