package JdkProxy.StaticProxy;

import java.io.Serializable;
import java.lang.reflect.InvocationHandler;

public class Proxy extends Object implements Serializable {
    //这是一个中介类，代理
    //它需要有房东的房源，我们通常不会继承房东，而会将房东作为一个私有属性host
    //我们通过host.rent()来实现租房的方法
    private Host host;
    public Proxy(Host host) {
        this.host = host;
    }
    public void rent(){
        host.rent();
        contract();
        fare();
    }
    public void seeHouse(){
        System.out.println("中介带你看房");
    }
    public void fare() {
        System.out.println("中介收中介费");
    }

    public void contract() {
        System.out.println("签租赁合同");
    }
}
