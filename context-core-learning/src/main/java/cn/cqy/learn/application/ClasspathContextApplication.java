package cn.cqy.learn.application;

import cn.cqy.learn.bean.Animal;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 通过这个方法对spring的ioc容器有一个初步的了解,掌握其中的重要方法和 applicationContext 的基础关系图
 *
 * 这里采用最精简的配置进行测试,防止有别的内容进行干扰
 *
 * @author caiqiyuan
 */
public class ClasspathContextApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-context.xml");
        Animal animal = applicationContext.getBean(Animal.class);
        animal.eat("banana");
    }

}
