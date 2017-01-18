package DecoratorPattern;

/**
 * Created by zhaoying on 2016/12/16.
 */
public abstract class Decorator implements Component{

    private Component mComponent ;

    public Decorator(Component mComponent) {
        this.mComponent = mComponent;
    }

    @Override
    public void operate() {
        mComponent.operate();
    }
}
