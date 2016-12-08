package BuilderPattern;

/**
 * Created by zhaoying on 2016/12/8.
 */
public class Director {

    private AbsBuilder builder ;

    public Product buildProduct(AbsBuilder concreteBuilder){
        builder = concreteBuilder ;

        builder.BuildMethod();

        builder.BuildMethod2();

        return builder.retrieveResult() ;
    }

    public static void main(String[] args) {
        Director director = new Director() ;

        ConcreteBuilder concreteBuilder = new ConcreteBuilder() ;

        Product product = director.buildProduct(concreteBuilder) ;
    }
}
