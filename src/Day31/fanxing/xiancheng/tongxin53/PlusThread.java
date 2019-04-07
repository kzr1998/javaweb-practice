package Day31.fanxing.xiancheng.tongxin53;

import java.util.ArrayList;
import java.util.List;

public class PlusThread extends Thread{
    private int start;
    private int[] arr;

    public PlusThread( int start,int[] arr) {
        this.start=start;
        this.arr=arr;
    }

    @Override
    public void run() {
        int sum=0;
        for(int i=start;i<start+10;i++){
            sum+=i;
        }
        int index=(start-1)/10;
        arr[index]=sum;
    }
    public static void main(String[] args){
        int arr[]=new int[10];
        List<Thread> list=new ArrayList<>();

        for (int i=0;i<10;i++){
            list.add(new PlusThread((10*i+1),arr));
            list.get(i).start();
        }
        for (int i=0;i<10;i++){
            try {
                list.get(i).join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int count=0;
        for (int i=0;i<arr.length;i++){
            count+=arr[i];
        }
        System.out.println(count);
    }
}
