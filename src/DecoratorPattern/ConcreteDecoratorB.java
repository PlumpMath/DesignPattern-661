package DecoratorPattern;

/**
 * Created by zhaoying on 2016/12/16.
 */
public class ConcreteDecoratorB extends Decorator {

    public ConcreteDecoratorB(Component mComponent) {
        super(mComponent);
    }

    @Override
    public void operate() {
        operateA();
        super.operate();
        operateB();
    }

    public void operateA(){

    }

    public void operateB(){

    }
}
