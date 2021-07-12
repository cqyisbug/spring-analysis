package cn.cqy.proxy.service;

import cn.cqy.proxy.annotation.MethodHelper;

/**
 * Created on 2021/7/12.
 *
 * @author caiqiyuan
 */
public class Dog {

    @MethodHelper("fruit")
    public void eat(String food) {
        System.out.println("eat " + food);
    }

}
