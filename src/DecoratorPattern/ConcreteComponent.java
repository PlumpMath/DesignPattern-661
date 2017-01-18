package DecoratorPattern;

/**
 * Created by zhaoying on 2016/12/16.
 */
public class ConcreteComponent implements Component {

    @Override
    public void operate() {
        System.out.println("concrete component");
    }
}
