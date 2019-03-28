package Day329Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StudentTest {
    public static void main(String[] args) {
        //定义三个Student类的对象及一个HashSet类的对象
     Student stu1=new Student(3,"Willliam",65.0f);
     Student stu2=new Student(1,"tom",87.0f);
     Student stu3=new Student(2,"lucy",95.0f);

        Set set=new HashSet();
        //将Student类的对象添加到集合中
       set.add(stu1);
       set.add(stu2);
       set.add(stu3);

        //使用迭代器显示Student类的对象中的内容
        Iterator it=set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("-------------------------------");
        System.out.println("添加重复元素后：");

        Student stu5=new Student(2,"lucy",95.0f);
        //Student stu4=new Student(2,"yucy",95.0f);
       // set.add(stu4);
        set.add(stu5);
         it=set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

}
