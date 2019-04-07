package Day4_6.Student;

import java.util.Objects;

public class Student {
    private String stuNum;
    private String stuName;
    private float math;
    private float chinese;
    public Student(String stuNum,String stuName,float math,float chinese) {
        this.stuNum = stuNum;
        this.stuName=stuName;
        this.math=math;
        this.chinese=chinese;
    }

    public String getStuNum() {
        return stuNum;
    }

    public void setStuNum(String stuNum) {
        this.stuNum = stuNum;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public float getMath() {
        return math;
    }

    public void setMath(float math) {
        this.math = math;
    }

    public float getChinese() {
        return chinese;
    }

    public void setChinese(float chinese) {
        this.chinese = chinese;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Float.compare(student.math, math) == 0 &&
                Float.compare(student.chinese, chinese) == 0 &&
                Objects.equals(stuNum, student.stuNum) &&
                Objects.equals(stuName, student.stuName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stuNum, stuName, math, chinese);
    }

    @Override
    public String toString() {
        return "学生{" +
                "学号='" + stuNum + '\'' +
                ", 名字='" + stuName + '\'' +
                ", 数学成绩=" + math +
                ", 语文成绩=" + chinese +
                '}';
    }
}
