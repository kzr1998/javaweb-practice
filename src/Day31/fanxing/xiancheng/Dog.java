package Day31.fanxing.xiancheng;

public class Dog implements Runnable {
    @Override
    public void run() {
        for(int i=1;i<=3;i++){
            System.out.println( Thread.currentThread().getName()+":"+"A dog");
        }
    }
}
