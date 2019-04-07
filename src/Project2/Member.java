package Project2;

public class Member extends Department{
    private String name;
    private String id;
    private int age;
    private String sex;


    public Member(String name, String id, int age, String sex) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<18&age>65) {
            this.age = 18;
        }else
            this.age=age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if(sex!="男"||sex!="女"){
        this.sex = "男";
        }else
            this.sex=sex;
    }

    @Override
    public String toString() {
        return "员工[" + "员工姓名='" + name + '\'' + ", 工号='" + id + '\'' + ", 年龄=" + age + ", 性别='" + sex + '\'' + ",所属部门="+getGetDepartmentname()+ ",职务信息="+'[';
    }
}
