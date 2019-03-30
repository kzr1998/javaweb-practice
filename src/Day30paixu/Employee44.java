package Day30paixu;

public class Employee44 implements Comparable<Employee44>{
    private String id;
    private String name;
    private double salary;

    public Employee44(String id, String name, double salary) {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "员工[" +
                "编号：" + id +
                ", 名字：'" + name + '\'' +
                ", 工资：" + salary +
                ']';
    }
    @Override
    public int compareTo(Employee44 e) {
        double salary=this.getSalary();
        double salary1=e.getSalary();
       int n=new Double(salary1-salary).intValue();
        return 0;
    }
}
