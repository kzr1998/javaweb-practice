package Project2;

public class Department {
    private String departmentid;
    private String Departmentname;
    private Member[]dtarr;
    private int number;

    public Department() {
    }
    public Department(String departmentid, String getDepartmentname) {
        this.departmentid = departmentid;
        this.Departmentname = getDepartmentname;
    }

    public String getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(String departmentid) {
        this.departmentid = departmentid;
    }

    public String getGetDepartmentname() {
        return Departmentname;
    }

    public void setGetDepartmentname(String getDepartmentname) {
        this.Departmentname = getDepartmentname;
    }
}
