package ProxyPattern;

/**
 * Created by zhaoying on 2017/1/18.
 */
public class RealSubject implements Subject {

    @Override
    public void visit() {
        System.out.println("Real Subject");
    }
}
