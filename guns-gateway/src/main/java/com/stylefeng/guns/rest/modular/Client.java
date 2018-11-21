package com.stylefeng.guns.rest.modular;

import com.alibaba.dubbo.config.annotation.Reference;
import com.stylefeng.guns.api.user.UserAPI;
import org.springframework.stereotype.Component;

/**
 * @author: 磊大大
 * @date: 2018/11/2 10:48
 */
@Component
public class Client {

    @Reference(interfaceClass = UserAPI.class)
    private UserAPI userAPI;

    public void run(){
        userAPI.login("admin","password");
    }
}
