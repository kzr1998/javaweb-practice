package Day4_9;

public class TestStudent {
    public static void main(String[]args){

            Student stu1 = new Student("1001", "张三", 89.0f, 78.0f);
            Student stu2 = new Student("1002", "李四", 87.0f, 76.0f);

            System.out.println(stu1);
            System.out.println(stu2);
            System.out.println(stu1.equals(stu2));

            Banji bj=new Banji("17","软件技术");
            bj.addStudent(stu1);
            bj.addStudent(stu2);
            bj.displayAllStudent();
            System.out.println("根据学号删除信息后：");
            bj.deleteStudent("1001");
            bj.displayAllStudent();
            bj.insertChineseScore("1002",78);
            System.out.println("添加语文成绩后");
             bj.displayAllStudent();
        }
    }

