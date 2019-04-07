package Day4_6.work3_8;

public class Department {
    //       类型描述：能够描述部门编号、部门名称、获取所有该部门员工信息
    //要求：设定方法统计该部门员工个数
    private String departmentName;
    private String departmentNum;
    private Member[] departmentMember;//定义存放员工的数组
    private int departmentMemberNumber;
    public Department()
    {

    }
    public Department(String departmentName,String departmentNum)
    {
        this.setDepartmentName(departmentName);
        this.setDepartmentNum(departmentNum);
    }
    public void setDepartmentName(String departmentName)
    {
        this.departmentName=departmentName;
    }
    public String getDepartmentName()
    {
        return this.departmentName;
    }
    public void setDepartmentNum(String departmentNum)
    {
        this.departmentNum=departmentNum;
    }
    public String getDepartmentNum()
    {
        return this.departmentNum;
    }
    public void setDepartmentMember(Member[] departmentMember)
    {
        this.departmentMember=departmentMember;
    }
    public Member[] getDepartmentMember()
    {
        if(this.departmentMember==null)
            departmentMember=new Member[200];
        return this.departmentMember;
    }
    public void setDepartmentMemberNumber(int departmentMemberNumber)
    {
        this.departmentMemberNumber=departmentMemberNumber;
    }
    public int getDepartmentMemberNumber()
    {
        return this.departmentMemberNumber;
    }
    public void statistics(Member[] departmentMember)       //统计部门职工人数的方法
    {
        this.departmentMemberNumber=0;
        for(int i=0;i<this.getDepartmentMember().length;i++)
        {
            if(departmentMember[i]!=null)
                this.departmentMemberNumber++;
            else
                return;
        }
    }

}



