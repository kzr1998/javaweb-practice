package Day329Set;

import java.util.Objects;

public class Student {
    private int stuid;
    private String name;
    private float score;

    public Student(int stuid,String name,float score) {
        this.stuid=stuid;
        this.name=name;
        this.score=score;
    }
    public int getStuid() {
        return stuid;
    }
    public void setStuid(int stuid) {
        this.stuid = stuid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" + "学号=" + stuid + "," +
                " 姓名='" + name + '\'' + "," +
                " 成绩=" + score + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return stuid == student.stuid &&
                Float.compare(student.score, score) == 0 &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(stuid, name, score);
    }
}

