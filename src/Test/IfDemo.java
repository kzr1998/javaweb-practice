package Test314;

import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args){
        int y=0;
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        if(x>0){
            y=2*x+1;
        }
        else {
        y=x+5;
        }
        System.out.println(x);
        System.out.println(y);
    }

}
