package Day31.fanxing.xiancheng;

public class ThreadTest {

    public static void main(String[] args){
        Cat cat=new Cat();
        Thread t1=new Thread(cat);
        t1.start();
        Dog dog=new Dog();
        Thread t2=new Thread(dog);
        t2.start();

        for(int i=1;i<=3;i++){
            System.out.println(Thread.currentThread().getName()+":"+"main thread");
        }
    }
}
