package Day31.fanxing.xiancheng.tongxin53;

public class Test2 implements Runnable {
    private int count=0;
    public int getCount(){
        return count;
    }

    @Override
    public void run() {
        for (int i=11;i<=20;i++){
            count+=i;
        }
    }
}
