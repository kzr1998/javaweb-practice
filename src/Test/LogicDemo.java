package Test314;

import java.util.Scanner;

public class LogicDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符");
        char ch = sc.next().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + "是a到z之间的字符");
        } else {
          System.out.println(ch+"不是a到z之间的字符");
        }

    }
    }

