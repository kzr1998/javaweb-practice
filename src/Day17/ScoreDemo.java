package Day17;

import javax.security.sasl.SaslServer;
import java.util.Scanner;

public class ScoreDemo {
    public static void main(String[] args) {
        int arr[][] = new int[3][2];
        Scanner sc = new Scanner(System.in);
        int sum =0;
        int sum1=0;
        for (int i = 0; i < arr.length; i++) {//用于循环从键盘输入成绩
            System.out.println("请输入第" + (i + 1) + "个学生的语文成绩：");
            arr[i][0] = sc.nextInt();
            System.out.println("请输入第" + (i + 1) + "个学生的数学成绩：");
            arr[i][1] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i][0];
            sum1+=arr[i][1];
            for (int j = 0; j < arr[i].length; j++) {

            }
        }
           System.out.print("语文总成绩为"+sum);
           System.out.println("语文平均成绩为："+sum/3);
           System.out.print("数学总成绩为"+sum1);
           System.out.println("数学平均成绩为："+sum1/3);
    }

}



