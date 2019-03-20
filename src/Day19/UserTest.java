package Day19;

public class UserTest {
    public static void main(String[] args){
        User u1= new User("张三",12345);
        User u= new User("李四",12345);

        u1.printmassage();
        u.printmassage();
    }
}
