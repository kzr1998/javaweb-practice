package day20;

public class CarTest {
    public static void main(String[] args){
        System.out.print("父类信息测试：");
        NoMotor nr=new NoMotor("绿源","红色",4,2);
        System.out.print(nr.work());
        System.out.println();

        System.out.print("自行车类信息测试：");
        Bicycle be=new Bicycle("死飞","黑色");
        System.out.print(be.work());
        System.out.println();

        System.out.print("电动车类信息测试：");
        ElectricVehicle e=new ElectricVehicle();
        e.setCellname("超霸");
        System.out.print(e.work());
        System.out.println();
        System.out.print("三轮车类信息测试：");
        Tricycle te=new Tricycle(3);
        System.out.println(te.work());
    }
}
