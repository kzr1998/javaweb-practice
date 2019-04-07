package Day4_6.TestWork;
import Day4_6.work3_8.*;

public class Test {
    public static void main(String[] args)
    {
        Department dep1=new Department("人事部","001");
        Department dep2=new Department("市场部","002");
        Position pos1=new Position("001","经理");
        Position pos2=new Position("002","助理");
        Position pos3=new Position("003","职员");
        Member mem1=new Member("张铭","S001","男",29,dep1,pos1);
        Member mem2=new Member("李艾爱","S002","女",21,dep1,pos2);
        Member mem3=new Member("孙超","S004","男",29,dep1,pos3);
        Member mem4=new Member("张美美","S005","女",26,dep2,pos3);
        Member mem5=new Member("蓝迪","S006","男",37,dep2,pos1);
        Member mem6=new Member("米莉","S007","女",24,dep2,pos2);
        dep1.statistics(dep1.getDepartmentMember());
        dep2.statistics(dep2.getDepartmentMember());
        System.out.println(mem1.toString());
        System.out.println(mem2.toString());
        System.out.println(mem3.toString());
        System.out.println(mem4.toString());
        System.out.println(mem5.toString());
        System.out.println(mem6.toString());
        System.out.println("人事部的人数为:"+dep1.getDepartmentMemberNumber());
        System.out.println("市场部的人数为:"+dep2.getDepartmentMemberNumber());
    }

}
