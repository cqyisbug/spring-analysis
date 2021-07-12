package cn.cqy.proxy.cglib;

import cn.cqy.proxy.annotation.MethodHelper;
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
        MethodHelper methodHelper = method.getAnnotation(MethodHelper.class);
        if (methodHelper != null && !methodHelper.value().isEmpty()) {
            System.out.println("i like " + methodHelper.value());
        }
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println("after");
        return result;
    }

}
