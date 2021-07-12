package cn.cqy.learn.factorybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author caiqy
 */
public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:/factory-bean.xml");
        RequestHandler requestHandler = applicationContext.getBean("test", RequestHandler.class);
        System.out.println(requestHandler.invoke(new Request("cqy", 30)).getMsg());
    }

}
