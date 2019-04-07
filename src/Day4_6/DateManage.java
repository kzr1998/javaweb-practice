package Day4_6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DateManage {
    public int[] insertdate() {
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<arr.length-1;i++){
           System.out.println("请输入"+(i+1)+"个数据:");
           try {
               arr[i] = sc.nextInt();
           }catch(InputMismatchException e){
               System.out.println("输入的数据有误，请重新输入：");
               sc.next();
               i--;
           }
        }
        return arr;
    }
    public void showDate(int []arr,int length){
        for (int i=0;i<length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        DateManage de = new DateManage();
         int[] arr=de.insertdate();
        de.showDate(arr,arr.length-1);

    }
}
