package Test314;

import java.util.Scanner;

public class IfElseDemo {
    public static void main(String[] args) {
        System.out.println("请输入一个整数：");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = 0;
        if (x < 0) {
            System.out.println("x=" + x);
            System.out.println("y=" + -1);
        } else if (x == 0) {
            System.out.println("x=" + x);
            System.out.println("y=" + 0);
        } if(x > 0){
            System.out.println("x=" + x);
            System.out.println("y=" + 1);
        }
    }
}