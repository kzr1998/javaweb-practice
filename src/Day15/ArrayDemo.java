package Day15;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args){
        //定义一个数组
        int []arr=new int[5];
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<arr.length;i++){
            System.out.println("请输入第"+(i+1)+"个数:");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("数组累加和"+sum);
    }
}
