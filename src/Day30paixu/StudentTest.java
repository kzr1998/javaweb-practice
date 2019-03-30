package Day30paixu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentTest implements Comparator<Student> {
   // @Override
//    public int compare(Student o1, Student o2) {
//        Integer old1=o1.getOld();
//        Integer old2=o2.getOld();
//        int n=old1.compareTo(old2);
//        return n;
//    }
    @Override
    public int compare(Student o1, Student o2) {
        String name1=o1.getName();
        String name2=o2.getName();
        int n=name1.compareTo(name2);
        return n;
    }
    public static void main(String[] args){
        Student stu1=new Student(40,20,"peter");
        Student stu2=new Student(28,5,"angel");
        Student stu3=new Student(35,18,"tom");
        List<Student>stuList=new ArrayList<Student>();
        stuList.add(stu1);
        stuList.add(stu2);
        stuList.add(stu3);
        System.out.println("排序前：");
        for (Student student:stuList){
            System.out.println(student);
        }
//        System.out.println("按年龄排序后：");
//        Collections.sort(stuList,new StudentTest());
//        for (Student student:stuList){
//            System.out.println(student);
//        }
        System.out.println("排序后：");
        Collections.sort(stuList,new StudentTest());
        for (Student student:stuList){
            System.out.println(student);
        }
    }


}
