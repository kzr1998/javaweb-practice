package Day30paixu;

import Day328jihe.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeTest44 {
    public static void main(String[] args){
        //定义Employee类的对象
        Employee44 e1=new Employee44("emp001","张三",1800.00);
        Employee44 e2=new Employee44("emp002","李四",2500.00);
        Employee44 e3=new Employee44("emp003","王五",1600.00);
        //将对象添加到List中
        List <Employee44>employee44List=new ArrayList<Employee44>();
        employee44List.add(e1);
        employee44List.add(e2);
        employee44List.add(e3);
        //输出排序前的数据
        System.out.println("排序前：");
      for (Employee44 employee44:employee44List){
          System.out.println(employee44);
      }
        //排序
        Collections.sort(employee44List);
        //输出排序后的数据
        System.out.println("排序后：");
        for (Employee44 employee44:employee44List){
            System.out.println(employee44);
        }
    }
}
