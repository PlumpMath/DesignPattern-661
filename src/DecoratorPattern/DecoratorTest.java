package DecoratorPattern;

/**
 * Created by zhaoying on 2016/12/16.
 */
public class DecoratorTest {
    public static void main(String[] args) {

        // 被装饰的组件
        Component component = new ConcreteComponent();

        // 构造装饰者对象 A ,给 被装饰的组件 增加装饰者 A 的方法
        Decorator decoratorA = new ConcreteDecoratorA(component) ;
        decoratorA.operate();

        // 构造装饰者对象 B ,给 被装饰的组件 增加装饰者 B 的方法
        Decorator decoratorB = new ConcreteDecoratorB(component);
        decoratorB.operate();
    }
}
