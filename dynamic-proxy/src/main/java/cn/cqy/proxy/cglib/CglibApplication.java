package cn.cqy.proxy.cglib;

import cn.cqy.proxy.service.Dog;
import net.sf.cglib.proxy.Enhancer;

/**
 * Created on 2021/7/12.
 *
 * @author caiqiyuan
 */
public class CglibApplication {

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setCallback(new CustomMethodInterceptor());
        enhancer.setSuperclass(Dog.class);
        Dog dog1 = (Dog) enhancer.create();
        dog1.eat("banana");
    }

}
