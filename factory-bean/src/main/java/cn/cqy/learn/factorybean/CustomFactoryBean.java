package cn.cqy.learn.factorybean;

import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.Proxy;

/**
 * @author caiqy
 */
public class CustomFactoryBean implements FactoryBean<Object> {

    @Override
    public Object getObject() throws Exception {
        return Proxy.newProxyInstance(Request.class.getClassLoader(), new Class[]{RequestHandler.class}, new CustomInvocationHandler());
    }

    @Override
    public Class<?> getObjectType() {
        return RequestHandler.class;
    }
}
