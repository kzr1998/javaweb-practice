package Day4_6.work3_8;


public class Member {
    //能够描述员工姓名、工号、年龄、性别、所属部门、职务信息
    /*要求：
    1、 设定方法限定年龄只能是18--65之间,反之则设置默认为18岁
    2、 设定方法限定性别只能是“男”或者“女”,反之则设置默认为"男"
    3、 重新toString方法，实现员工自我介绍信息*/
    private String memberName;
    private String memberNum;
    private int memberAge;
    private String memberSex;
    private Department department;
    private Position position;
    public Member()
    {

    }
    public Member(String memberName,String memberNum,String memberSex,int memberAge,Department department,Position position)
    {
        setMemberName(memberName);
        setMemberNum(memberNum);
        setMemberAge(memberAge);
        setMemberSex(memberSex);
        this.setDepartment(department); //与department产生关联，完成添加所属部门
        this.setPosition(position); ////与position产生关联，完成添加所属职务
    }
    public void setMemberName(String memberName)
    {
        this.memberName=memberName;
    }
    public String getMemberName()
    {
        return this.memberName;
    }
    public void setMemberNum(String memberNum)
    {
        this.memberNum=memberNum;
    }
    public String getMemberNum()
    {
        return this.memberNum;
    }
    public void setMemberAge(int memberAge)
    {
        if(memberAge<18||memberAge>65)
            this.memberAge=18;
        else
            this.memberAge=memberAge;
    }
    public int getMemberAge()
    {
        return this.memberAge;
    }
    public void setMemberSex(String memberSex)
    {
        if(memberSex!="男"&memberSex!="女")
            this.memberSex="男";
        else
            this.memberSex=memberSex;
    }
    public String getMemberSex()
    {
        return this.memberSex;
    }
    public void setDepartment(Department department)
    {
        this.department=department;
        for(int i=0;i<this.getDepartment().getDepartmentMember().length;i++)  //员工与部门双向关联
        {                                                           //即员工有了部门之后，对应的这个部门也要有这个员工.
            if(this.getDepartment().getDepartmentMember()[i]==null) //但由于一个员工只有一个部门，一个部门可以有很多员工，所以部门类下的员工必须要用数组来存。
            {
                this.getDepartment().getDepartmentMember()[i]=this;
                return;
            }
        }
    }
    public Department getDepartment()
    {
        return this.department;
    }
    public void setPosition(Position position)
    {
        this.position=position;
        for(int i=0;i<this.position.getPositionMember().length;i++)  //员工与职位的双向关联
        {
            if(this.position.getPositionMember()[i]==null)
            {
                this.position.getPositionMember()[i]=this;
                return;
            }
        }
    }
    public Position getPosition()
    {
        return this.position;
    }
    public String toString()
    {
        String str="姓名:"+this.getMemberName()+"\n工号:"+this.getMemberNum()+"\n性别:"+this.getMemberSex()
                +"\n年龄:"+this.getMemberAge()+"\n所在部门:"+this.getDepartment().getDepartmentName()+"\n职位:"+this.getPosition().getPositionName()+
                "\n=========================================================";
        return str;
    }
}


