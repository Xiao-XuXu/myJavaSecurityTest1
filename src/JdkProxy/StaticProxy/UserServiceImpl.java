package JdkProxy.StaticProxy;

public class UserServiceImpl implements UserService{
    //类实现接口，重写接口里的所有方法
    // 需要一个真实对象来完成这些增删改查操作
    @Override
    public void add() {
        System.out.println("增加了一个用户");
    }

    @Override
    public void delete() {
        System.out.println("删除了一个用户");

    }

    @Override
    public void update() {
        System.out.println("更新了一个用户");

    }

    @Override
    public void query() {
        System.out.println("查询了一个用户");

    }

}
