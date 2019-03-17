package Day17;

public class AreaDemo {
    public double area(double r){
        return r*r*Math.PI;
    }
    public double area(double a,double b){
        return a*b;
    }
    public static void main(String[] args){
        AreaDemo ad=new AreaDemo();
        System.out.println(ad.area(4.5));
        System.out.println(ad.area(8,5));
    }
}
