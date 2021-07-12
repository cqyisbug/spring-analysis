package cn.cqy.proxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created on 2021/7/12.
 *
 * @author caiqiyuan
 */
public class CustomMethodInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("before");
        Object result =methodProxy.invokeSuper(o, objects);
        System.out.println("after");
        return result;
    }

}
