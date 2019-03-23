package Day23;

public class Test {
    public static void main(String[] args) {
        Shape s=new Rectangle(5.0,6.0);
        System.out.println("矩形的面积为 "+s.area());
        Shape s1=new Circle(3.5);
        System.out.println("圆的面积为 "+s1.area());
    }
}
