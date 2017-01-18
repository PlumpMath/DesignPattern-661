package ProxyPattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;

/**
 * Created by zhaoying on 2017/1/18.
 */
public class Client {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {

        // 被代理的类
        RealSubject real = new RealSubject();

        // 静态代理
        ProxySubject proxySubject = new ProxySubject(real);

        proxySubject.visit();

        // 动态代理实例
        DynamicProxy proxy = new DynamicProxy(real);

        ClassLoader loader = real.getClass().getClassLoader();

        Subject subject = (Subject) Proxy.newProxyInstance(loader,new Class[]{Subject.class},proxy);

        subject.visit();

        // 动态代理类

        InvocationHandler handler = new MyInvacotionHandler() ;
        Class proxyClass = Proxy.getProxyClass(RealSubject.class.getClassLoader(),
                new Class[]{Subject.class});

        try {
            Constructor constructor = proxyClass.getConstructor(new Class[]{InvocationHandler.class});
            RealSubject realSubject = (RealSubject) constructor.newInstance(new Object[]{handler});

            realSubject.visit();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
