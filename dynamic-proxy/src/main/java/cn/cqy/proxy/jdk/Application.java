package cn.cqy.proxy.jdk;

import cn.cqy.proxy.service.UserService;

import java.lang.reflect.Proxy;

/**
 * Created on 2021/7/12.
 *
 * @author caiqiyuan
 */
public class Application {

    public static void main(String[] args) {

        UserService userService =
                (UserService) Proxy.newProxyInstance(UserService.class.getClassLoader(), new Class[]{UserService.class}, new CustomInvocationHandler());
        userService.hello();
    }

}
