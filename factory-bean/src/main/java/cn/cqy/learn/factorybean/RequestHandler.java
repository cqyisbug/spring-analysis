package cn.cqy.learn.factorybean;

/**
 * @author caiqy
 */
public interface RequestHandler {

    Response invoke(Request request);

}
