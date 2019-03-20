package day20;

public class Test {
    public static void main(String[] args){
        System.out.print("父类信息测试：");
        Work wk=new Work();
        System.out.print(wk.work());

        System.out.println();

        System.out.print("测试工作类信息测试：");
        TestWork tk=new TestWork("测试工作",10,5);
        System.out.print(tk.work());

        System.out.println();

        System.out.print("研发工作类信息测试：");
        DevelopmentWork dk=new DevelopmentWork("研发工作",1000,10);
        System.out.println(dk.work());
    }
}
