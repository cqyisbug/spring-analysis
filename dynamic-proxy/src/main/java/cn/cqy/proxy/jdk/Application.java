package cn.cqy.proxy.jdk;

import cn.cqy.proxy.service.UserService;

import java.lang.reflect.Proxy;

/**
 * 这个测试主要是想用注解去实现代理内部的方法,这样的话对于理解spring的factory bean很有好处
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
