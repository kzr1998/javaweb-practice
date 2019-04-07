package Day31.fanxing.xiancheng.tongxin53;
//创建10个线程，第一个从1-10加起来，第二从11-20，最后一个91加到100 ,最后把10个线程结果加起来
public class Accumulator extends Thread{
    public static int sum;
    private int strNum;

    public Accumulator(int strNum){
        this.strNum=strNum;
    }
    public static synchronized void add(int num){
        sum+=num;
    }
    @Override
    public void run() {
        int sum=0;
        for(int i=0;i<10;i++){
            sum+=(strNum+i);
        }
        add(sum);
    }
    public static void main(String[] args){
        Thread[] threadList=new Thread[10];
        for(int i=0;i<10;i++){
            threadList[i]=new Accumulator((10*i)+1);
            threadList[i].start();
        }
        for (int i=0;i<10;i++){
            try {
                threadList[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(sum);
    }
}
