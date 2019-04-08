package Day4_9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Banji {
    private String classId;//班级编号
    private String className;//班级名称
    private List<Student> stuList;
    //构造方法
    public Banji(String classId, String className) {
        this.classId = classId;
        this.className = className;
        stuList=new ArrayList<Student>();
    }
    public String getClassId() {
        return classId;
    }
    public void setClassId(String classId) {
        this.classId = classId;
    }
    public String getClassName() {
        return className;
    }
    public void setClassName(String className) {
        this.className = className;
    }
    public List<Student> getStuList() {
        return stuList;
    }
    public void setStuList(List<Student> stuList) {
        this.stuList = stuList;
    }
    //将学生添加到班级
    public void addStudent(Student stu){
        //要排除重复添加的情况
        boolean flag=false;//判断学生列表中的学生是否存在
        for (Student stu1:stuList){
            if(stu1.equals(stu)){
                flag=true;break;
            }
        }
        if(flag){
            System.out.println("该学生已存在学生列表中，添加失败！");
        }else {
            stuList.add(stu);
        }
    }
    //通过学号查询学生在班级中是否存在
    public Student searchStudentByNum(String stuNum){
        Student student=null;
        //ID是唯一的
        for (Student student1:stuList){
            if(student1.getStuNum().equals(stuNum)){
                //如果相等就找到了
                student=student1;break;
            }
        }
        return student;
    }
    //输入班级学生的语文成绩
    public void insertChineseScore(String stuNum,float score){
        Scanner sc=new Scanner(System.in);
        Student student1=searchStudentByNum(stuNum);
        score=student1.getChinese();
        if(student1==null){
            System.out.println("没有找到stuNum为"+stuNum+"对应的学号");
        }else {
           stuList.remove(student1);
           stuList.add(student1);
           System.out.println("添加成功！");
        }
    }
    // 输入班级学生的数学成绩
    public void insertMathScore(String stuNum,float score){}
    // 删除学生信息：
    public void deleteStudent(String stuNum){
        Student student=searchStudentByNum(stuNum);
        if(student!=null){
            stuList.remove(student);
        }else {
            System.out.println("没有找到对应stuNum为"+stuNum+"对应的信息");
        }
    }
//显示所有学生的信息
    public void displayAllStudent(){
        System.out.println("学生所有信息为：");
        for (Student student:stuList){
            System.out.println(student);
        }
    }
}
