package Day31.fanxing.xiancheng;

public class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }
    @Override
    public void run() {
        for(int i=1;i<=10;i++){
            System.out.println(getName()+"正在打印"+i);
        }
    }
    public static void main(String[] args){
        MyThread md=new MyThread("打印机");
        md.start();
    }
}
