package cn.cqy.proxy.jdk;

import cn.cqy.proxy.annotation.MethodHelper;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created on 2021/7/12.
 *
 * @author caiqiyuan
 */
public class CustomInvocationHandler implements InvocationHandler {

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        MethodHelper methodHelper = method.getAnnotation(MethodHelper.class);
        if (methodHelper != null && !methodHelper.value().isEmpty()) {
            System.out.println(methodHelper.value());
        }
        return null;
    }

}
