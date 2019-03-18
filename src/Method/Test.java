package Method;

public class Test {
    public static void main(String[] args) {
        Person p=new Person();
        p.name="李明";
        p.age=10;
        p.grade=5;
        p.stu();
        System.out.println("我是一个"+p.xingbie("男")+"孩");
        p.mySelf();

    }

}
