package Day17;

public class DisCountDemo {
    public  void discount(int x){
    if(x<=100){
        System.out.println("不打折");
    }else if(x>100&&x<200) {
         System.out.println("9.5折后商品总价为："+x*0.95);
        }if(x>200){
        System.out.println("8.5折后商品总价为："+x*0.85);
        }
}
    public static void main(String[] args){
        DisCountDemo dis=new DisCountDemo();
        dis.discount(150);
    }

}
