package cn.cqy.learn.bean;

/**
 * Created on 2021/7/9.
 *
 * @author caiqiyuan
 */
public class Dog implements Animal {

    private Banana2 banana2;

    @Override
    public boolean eat(String food) {
        if (banana2.getName().equals(food)) {
            System.out.println("dog don't like " + food);
            return false;
        }
        System.out.println("dog likes eat" + food);
        return true;
    }

    public Banana2 getBanana2() {
        return banana2;
    }

    public void setBanana2(Banana2 banana2) {
        this.banana2 = banana2;
    }
}
