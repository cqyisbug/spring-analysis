package cn.cqy.learn.factorybean;

import org.springframework.util.StringUtils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author caiqy
 */
public class CustomInvocationHandler implements InvocationHandler {

    // 想了一下feign的实现,基本上就和这个差不太多了,通过method获取到返回类型,然后利用注解获取到的信息创建一个
    // http请求,就是如此的简单
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String msg = StringUtils.arrayToCommaDelimitedString(args);
        Response response = new Response();
        response.setMsg(msg);
        return response;
    }
}
