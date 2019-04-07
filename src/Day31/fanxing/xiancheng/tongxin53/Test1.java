package Day31.fanxing.xiancheng.tongxin53;
/*  创建10个线程，第一个从1-10加起来，第二从11-20，最后一个91加到100
*    最后把10个线程结果加起来
* */
public class Test1 implements Runnable {
   private int count=0;
   protected int n;
   public int getCount(){
       return count;
   }

    @Override
    public void run() {
        for (int i=1;i<=10;i++){
            count+=n+i;
        }
    }
}
