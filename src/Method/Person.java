package Method;

public class Person {
    public String name;
    public int age;
    public int grade;
    String sex="男";
    public void stu(){
        System.out.println("我是一名学生！");
    }
    public String xingbie(String sex){
        return sex;

    }
    public void mySelf(){
        System.out.println("我的名字叫"+name+","+"我已经"+age+
        "岁了"+","+"我读"+grade+"年级了。");
    }
}
