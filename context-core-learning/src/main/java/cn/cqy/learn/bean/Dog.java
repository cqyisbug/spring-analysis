package cn.cqy.learn.bean;

/**
 * Created on 2021/7/9.
 *
 * @author caiqiyuan
 */
public class Dog implements Animal {
    @Override
    public boolean eat(String food) {
        if ("banana".equals(food)) {
            System.out.println("dog don't like " + food);
            return false;
        }
        System.out.println("dog likes eat" + food);
        return true;
    }
}
