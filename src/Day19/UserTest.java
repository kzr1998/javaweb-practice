package Day19;

public class UserTest {
    public static void main(String[] args){
        //1
        User u1= new User("张三","12345");
        User u= new User("李四","123745");

       System.out.println(u.info());
       System.out.println(u1.info());
        System.out.println("============");
        String result=new UserManager().checkUser(u1,u);
        System.out.println(result);
       //2
        System.out.println();

        User u2= new User("李四","12345");
        User u3= new User("李四","12345");
        System.out.println(u2.info());
        System.out.println(u3.info());
        System.out.println("============");
        String result1=new UserManager().checkUser(u2,u3);
        System.out.println(result1);
      //3
        System.out.println();

        User u4= new User("李四","125345");
        User u5= new User("李四","12345");
        System.out.println(u4.info());
        System.out.println(u5.info());
        System.out.println("============");
        String result2=new UserManager().checkUser(u4,u5);
        System.out.println(result2);
        //4
        System.out.println();

        User u6= new User("","125345");
        User u7= new User("","125345");
        System.out.println(u6.info());
        System.out.println(u7.info());
        System.out.println("============");
        String result3=new UserManager().checkUser(u6,u7);
        System.out.println(result3);
       //5
        System.out.println();
        User u8= new User("李四","");
        User u9= new User("李四","");
        System.out.println(u8.info());
        System.out.println(u9.info());
        System.out.println("============");
        String result4=new UserManager().checkUser(u8,u9);
        System.out.println(result4);
    }
}
