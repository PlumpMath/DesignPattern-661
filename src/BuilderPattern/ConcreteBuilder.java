package BuilderPattern;

/**
 * Created by zhaoying on 2016/12/8.
 */
public class ConcreteBuilder extends AbsBuilder {

    Product mProduct = new Product() ;


    @Override
    public void BuildMethod() {
        System.out.println("设置 Product 某项属性");
    }

    @Override
    public void BuildMethod2() {
        System.out.println("设置 Product 某项属性");
    }

    @Override
    public Product retrieveResult() {
        return mProduct ;
    }
}
