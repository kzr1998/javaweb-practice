package Day31.fanxing.xiancheng.tongxin53;

public class AddTest {
    public static void main(String[] args){
        Test1 T=new Test1();
        Test2 T2=new Test2();

        Thread t=new Thread(T);
        Thread t2=new Thread(T2);

        t.start();
        t2.start();

        try {
            t.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(T.getCount()+T2.getCount());
    }
}
