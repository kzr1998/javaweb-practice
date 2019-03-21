package Day21;

public class Test1 {
    public static void main(String[] args) {
        Fruits f1= new  Fruits("圆","甜");
        Fruits f2=new Fruits("圆","甜");
        System.out.println(f1.eat());
        System.out.println("fru1和fru2的引用比较: "+f1.equals(f2));

        System.out.println("---------------------------");
        Waxberry waxberry = new Waxberry("圆形","酸甜适中","紫红色");
        System.out.println(waxberry.face());
        System.out.println(waxberry.eat());
        System.out.println(waxberry.toString());

        System.out.println("---------------------------");
        Banana banana = new Banana("短而稍圆","果肉香甜","蕉类","黄色");
        System.out.println(banana.advantage());
        System.out.println("仙人蕉颜色为"+banana.getColor());
    }
}
