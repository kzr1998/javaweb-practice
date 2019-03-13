package Test314;

import java.util.Scanner;

public class IntDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个整数:");
        int n = sc.nextInt();
        if (n % 5 == 0 || n % 7 == 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
