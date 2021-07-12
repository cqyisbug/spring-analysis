package cn.cqy.proxy.annotation;

import java.lang.annotation.*;

/**
 * Created on 2021/7/12.
 *
 * @author caiqiyuan
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MethodHelper {

    String value();

}
