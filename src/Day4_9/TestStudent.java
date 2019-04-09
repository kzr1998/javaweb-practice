package Day4_9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
          TestStudent tt=new TestStudent();
          //tt.testBanJi();
         // System.out.println("=====================================");
          //tt.testSchool();
        tt.test();
        }
    public void testBanJi(){
        Banji b1 = new Banji("01", "一班");
        b1.addStudent(new Student("001", "小刘", 90, 70));
        b1.addStudent(new Student("002", "小马", 80, 60));
        b1.addStudent(new Student("003", "小张", 70, 65));

        Banji b2 = new Banji("02", "二班");
        b2.addStudent(new Student("004", "小王", 90, 70));
        b2.addStudent(new Student("005", "小李", 95, 60));
        b2.addStudent(new Student("006", "小吴", 100, 50));
        System.out.println("显示班级一的所有学生");
        b1.displayAllStudent();

        System.out.println("通过学号查询学生在班级中是否存在");
        Student s = b1.searchStudentByNum("001");
        System.out.println(s);

        System.out.println("输入班级学生的语文成绩：");
        b1.insertChineseScore("002", 55);
        b1.displayAllStudent();

        //输入班级学生的数学成绩：

        //删除学生信息：

        //显示所有学生的信息（包括学号和姓名）：


    }

    public void testSchool(){
        Map<String, Banji> map = new HashMap<>();
        School school = new School();
        Banji b1 = new Banji("01", "一班");
        b1.addStudent(new Student("001", "小刘", 90, 70f));
        b1.addStudent(new Student("002", "小马", 80, 60f));
        b1.addStudent(new Student("003", "小张", 70, 65f));

        Banji b2 = new Banji("02", "二班");
        b2.addStudent(new Student("004", "小王", 90, 70));
        b2.addStudent(new Student("005", "小李", 95, 60));
        b2.addStudent(new Student("006", "小吴", 100, 50));

        school.addBanji(b1);
        school.addBanji(b2);


        //查询班级
        System.out.println(school.searchByName("一班"));
        System.out.println(school.searchByName("五班"));

        //语文成绩按平均分排序
        school.sortChineseByAverage();

        //显示所有班级名称
        school.displayBanJiName();
    }

    public void mainMenu(){
        System.out.println("***************************************");
        System.out.println("                 **主菜单**                      ");
        System.out.println("                 1--班级管理    ");
        System.out.println("                 2--学校管理    ");
        System.out.println("                 0--退出   ");
        System.out.println("***************************************");
    }

    public void schoolMenu(){
        System.out.println("*******************************************************");
        System.out.println("                 **学校管理**    ");
        System.out.println("                 1-- 创建班级    ");
        System.out.println("                 2--删除班级    ");
        System.out.println("                 3--通过班级名称查询班级信息  ");
        System.out.println("                 4--对各班语文成绩按平均分进行由大到小排序    ");
        System.out.println("                 5--对各班数学成绩按平均分进行由大到小排序    ");
        System.out.println("                 6--显示所有班级名称    ");
        System.out.println("                 9--返回上一级菜单   ");
        System.out.println("*******************************************************");
    }

    public void banJiMenu(){
        System.out.println("*******************************************************");
        System.out.println("                 **班级管理**    ");
        System.out.println("                 1-- 添加学生信息到主学生列表    ");
        System.out.println("                 2--添加学生信息到普通班级    ");
        System.out.println("                 3--通过学号查询学生信息   ");
        System.out.println("                 4--输入班级的语文成绩    ");
        System.out.println("                 5--输入班级的数学成绩    ");
        System.out.println("                 6--删除学生信息    ");
        System.out.println("                 7--显示所有学生信息    ");
        System.out.println("                 9--返回上一级菜单   ");
        System.out.println("*******************************************************");
    }

    public void test(){
        TestStudent Tt=new TestStudent();
        Scanner sc=new Scanner(System.in);
        int input = 0, input1 = 0, input2 = 0;
        //创建一个学校
       School sl=new School();
        //创建班级
        Banji b1 = new Banji("01", "一班");
        sl.addBanji(b1);
        Banji putongbj=null;
        while (true){
            Tt.mainMenu();
            System.out.println("请输入对应数字进行操作：");
            input = sc.nextInt();
            if (input == 0) {
                break;
            }
            switch (input){
                case 1:
                    //班级管理
                    Tt.banJiMenu();
                    System.out.println("请输入对应的数字学生进行管理：");
                    input1 = sc.nextInt();
                    if(input1==9)
                        break;
                        switch(input1){
                            case 1:
                                System.out.println("添加学生信息到主学生列表 ");
                                System.out.println("请输入学生的个数：");
                                int count=sc.nextInt();
                                for(int i=1;i<=count;i++){
                                    System.out.println("请输入第"+i+"个学生");
                                    System.out.println("请输入学生学号：");
                                    String stuNum=sc.next();
                                    System.out.println("请输入学生姓名：");
                                    String stuName=sc.next();
                                    System.out.println("请输入数学成绩：");
                                    float math=sc.nextFloat();
                                    System.out.println("请输入语文成绩：");
                                    float chinese=sc.nextFloat();
                                    Student student=new Student(stuNum,stuName,math,chinese);
                                    b1.addStudent(student);
                                    b1.displayAllStudent();
                                 }
                                  break;
                            case 2:
                                System.out.println("添加学生信息到普通班级");
                                System.out.println("请输入要添加的班级名称：");
                                String sName=sc.next();
                                //根据班级名称判断是否在班级中存在
                                putongbj=sl.searchByName(sName);
                                if(putongbj==null){
                                    System.out.println("该班级不存在，请先将班级添加到班级列表");
                                }else {
                                    System.out.println("请输入要添加的学生数量：");
                                    int count1=sc.nextInt();
                                    for(int i=1;i<=count1;i++){
                                        System.out.println("请输入第"+i+"个学生");
                                        System.out.println("请输入学生学号：");
                                        String stuNum=sc.next();
                                        //判断该ID是否在主列表存在
                                        Student student=b1.searchStudentByNum(stuNum);
                                        if(student==null){
                                            //如果学生不存在，则创建新的添加，并且添加到主列表
                                            System.out.println("该学生在1班不存在，继续输入学生的其他信息！");
                                            System.out.println("请输入学生姓名：");
                                            String stuName=sc.next();
                                            System.out.println("请输入数学成绩：");
                                            float math=sc.nextFloat();
                                            System.out.println("请输入语文成绩：");
                                            float chinese=sc.nextFloat();
                                            student=new Student(stuNum,stuName,math,chinese);
                                            b1.addStudent(student);
                                            b1.displayAllStudent();
                                        }else {
                                            putongbj.addStudent(student);
                                        }
                                    }
                                    System.out.println("1班：");
                                    b1.displayAllStudent();
                                    System.out.println("普通班级：");
                                    putongbj.displayAllStudent();
                                }
                                break;
                            case 3:
                            System.out.println("通过学生ID查询班级的信息");
                            System.out.println("请输入要查询的班级名称：");
                            String banjiName=sc.next();
                            Banji banji=sl.searchByName(banjiName);
                            if(banji==null){
                                System.out.println("该班级不存在");break;
                            }else {
                                System.out.println("请输入要查询的ID：");
                                String stuNum=sc.next();
                                Student s=banji.searchStudentByNum(stuNum);
                                if(s==null){
                                    System.out.println("该学生在班级里"+banjiName+"中不存在");
                                }else {
                                    System.out.println("该学生的信息为：");
                                    System.out.println(s);
                                }
                            }
                            break;
                            case 4:
                                System.out.println("请输入学生学号：");
                                String stuNum=sc.next();
                                System.out.println("请输入语文成绩：");
                                float chinese=sc.nextFloat();
                                b1.insertChineseScore(stuNum,chinese);
                                break;
                            case 5:
                                System.out.println("请输入学生学号：");
                                String stuNum1=sc.next();
                                System.out.println("请输入数学成绩：");
                                float math=sc.nextFloat();
                                b1.insertMathScore(stuNum1,math);
                                break;
                            case 6:
                                System.out.println("请输入学生学号：");
                                String stuNum2=sc.next();
                                b1.deleteStudent(stuNum2);
                                break;
                            case 7:
                                b1.displayAllStudent();
                                break;
                                default:
                                    System.out.println("该数字没有对应的操作！");
                                    break;
                    }
                    break;
                        case 2:
                            while (true){
                                Tt.schoolMenu();
                                System.out.println("请输入对应的数字对班级进行管理：");
                                input2=sc.nextInt();
                                if(input2==9)
                                    break;
                                    switch (input2){
                                        case 1:
                                           System.out.println("输入需要添加的班级名称：");
                                           String className=sc.next();
                                           putongbj=new Banji("003",className);
                                           sl.addBanji(putongbj);
                                           break;
                                        case 2:
                                          System.out.println("从班级列表中删除班级");
                                          System.out.println("请输入要删除的班级名称：");
                                          String className1=sc.next();
                                          if(className1.equals(b1)){
                                              System.out.println("此班级不可删除！");
                                              break;
                                    }
                                    Banji banji=sl.searchByName(className1);
                                          if(banji==null){
                                              System.out.println("该班级不存在！");
                                          }else {
                                              sl.deleteBanji(banji);
                                          }
                                          break;
                                        case 3:
                                         System.out.println("通过名称查询班级");
                                         System.out.println("请输入要查询的班级名称：");
                                         String className2=sc.next();
                                         Banji banji1=sl.searchByName(className2);
                                         if(banji1==null){
                                             System.out.println("该班级已存在！");
                                             System.out.println("该班级名称为"+className2);
                                             sl.displayBanJiName();
                                         }
                                         break;
                                        case 4:
                                            sl.sortChineseByAverage();
                                            break;
                                        case 5:
                                            sl.sortMathByAverage();
                                            break;
                                        case 6:
                                            sl.displayBanJiName();
                                            break;
                                        default:
                                        System.out.println("该数字没有对应的操作！");
                                        break;
                                }
                            }
                            break;
                default:
                    System.out.println("该数字没有对应的操作！");
                    break;
             }



        }
    }
}



