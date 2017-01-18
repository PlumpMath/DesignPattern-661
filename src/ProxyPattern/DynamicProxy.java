package ProxyPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by zhaoying on 2017/1/18.
 */
public class DynamicProxy implements InvocationHandler {

    private Object obj ;


    public DynamicProxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 调用被代理类对象的方法
        Object result = method.invoke(obj,args);
        return result ;
    }
}
