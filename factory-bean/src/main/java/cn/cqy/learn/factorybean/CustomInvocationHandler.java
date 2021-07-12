package cn.cqy.learn.factorybean;

import org.springframework.util.StringUtils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author caiqy
 */
public class CustomInvocationHandler implements InvocationHandler {
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String msg = StringUtils.arrayToCommaDelimitedString(args);
        Response response = new Response();
        response.setMsg(msg);
        return response;
    }
}
