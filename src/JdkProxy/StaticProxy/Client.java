package JdkProxy.StaticProxy;

import org.omg.CORBA.ShortSeqHelper;

public class Client {
    //Client.java  这是启动类，这个类就是租客
    //租客就是找到中介，租房
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        UserServiceProxy proxy = new UserServiceProxy();
        proxy.setUserService(userService);
        proxy.add();
    }
}
