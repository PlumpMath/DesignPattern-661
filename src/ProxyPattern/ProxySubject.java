package ProxyPattern;

/**
 * Created by zhaoying on 2017/1/18.
 */
public class ProxySubject implements Subject {
    private RealSubject mSubject ;


    public ProxySubject(RealSubject mSubject) {
        this.mSubject = mSubject;
    }

    @Override
    public void visit() {
        mSubject.visit();
    }
}
