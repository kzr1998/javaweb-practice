package Day328jihe;

import java.util.ArrayList;

public class EmployeeTest {
    public static void main(String[] args) {
        //定义ArrayList对象
        ArrayList list=new ArrayList();
        //创建三个Employee类的对象
      Employee ee=new Employee(1,"张三",5000.0);
      Employee ee1=new Employee(2,"李四",5500.0);
      Employee ee2=new Employee(3,"赵六",4000.0);
        //添加员工信息到ArrayList中
      list.add(ee);
      list.add(ee1);
      list.add(ee2);
        //显示员工的姓名和薪资
        for(int i=0;i<list.size();i++){
            System.out.print("员工姓名");
            System.out.println(((Employee)(list.get(i))).getName());
            System.out.print("员工工资");
            System.out.println(((Employee)(list.get(i))).getSalary());
        }
    }
}
