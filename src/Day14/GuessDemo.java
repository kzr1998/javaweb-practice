package Day14;

import java.util.Scanner;

public class GuessDemo {
    public static void main(String[] args){
        int number=(int) (Math.random()*10+1);
        int Guess;
        System.out.println("请猜一个数：");
        do{
            Scanner sc=new Scanner(System.in);
            Guess=sc.nextInt();

            if(Guess>number){
                System.out.println("输出的数太大了"+Guess);
            }else if(Guess<number){
                System.out.println("输出的数太小了"+Guess);
            }
        }while (Guess!=number);
        System.out.println("你猜对了："+Guess);
    }
}
