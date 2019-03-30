package Day30paixu;

public class Student {
    private int stuid;
    private int old;
    private String name;

    public Student(int stuid,int old,String name) {
        this.stuid=stuid;
        this.old = old;
        this.name=name;
    }

    public int getStuid() {
        return stuid;
    }

    public void setStuid(int stuid) {
        this.stuid = stuid;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "[" +
                "学号=" + stuid +
                ", 年龄=" + old +
                ", 名字='" + name + '\'' +
                ']';
    }
}
