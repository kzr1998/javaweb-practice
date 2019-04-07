package Day4_6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StuManage {
    public void displayMenu() {
        System.out.println("***************************");
        System.out.println("    "+"1--初始化数学成绩");
        System.out.println("    "+"2--求成绩的平均值");
        System.out.println("    "+"3--统计成绩大于85分的人数");
        System.out.println("    "+"4--修改指定位置处的成绩");
        System.out.println("    "+"5--打印输出所有成绩");
        System.out.println("    "+"0--退出");
        System.out.println("***************************");
    }
    public   float[] initScore() {
        int length = 0;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入数组长度：");
        length=sc.nextInt();
        float[]a=new float[length];
        for (int i=0;i<length-1;i++){
            System.out.println("请输入"+(i+1)+"个数据：");
                try {
                    a[i] = sc.nextFloat();
                }catch (Exception e){
                    System.out.println(e);
                }
        }
        return a;
    }
    public float average(float[] a) {
        float sum=0;
        for (int i=0;i<a.length;i++){
            sum+=a[i];
        }
        System.out.print("平均数："+(sum/a.length));
        System.out.println();
        return 0;
    }
    public int count(float[] a) {
        int count=0;
        for (int i=0;i<a.length;i++){
            if(a[i]>85){
                ++count;
            }
        }
        System.out.println("成绩大于85的人数："+count);
        return 0;
    }
    public void update(float[] a, int n, float newScore) {
        for (int i = a.length - 1; i > newScore; i--) {
            a[i] = a[i - 1];
        }
        a[(int) newScore] = n;
    }
    public void displayAllScore(float[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "     ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        StuManage se=new StuManage();
        Scanner sc=new Scanner(System.in);
        int input = 0;
        float[] a=null;
        int n=0;
        float newScore=0;
        while (true){
            se.displayMenu();
            System.out.println("请输入对应的数字进行操作：");
            try {
                input=sc.nextInt();
            }catch (InputMismatchException e){
                System.out.println("输入的数据格式有误，不能有非数字！");
                sc.next();
                continue;
            }
            if(input==0){
                System.out.println("退出程序！");
                break;
            }
            switch (input){
                case 1:
                    //插入数据
                   a=se.initScore();
                    System.out.println("数组元素为：");
                    se.displayAllScore(a);
                   break;
                case 2:
                    if(a!=null) {
                        se.displayAllScore(a);
                        se.average(a);
                    }
                    break;
                case 3:
                    if(a!=null) {
                   se.count(a);}
                   break;
                case 4:
                    if(a!=null) {
                        System.out.println("请输入要插入的数据：");
                        try {
                            n = sc.nextInt();
                            System.out.println("请输入要插入数据的位置：");
                            newScore = sc.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println("输入的数据格式有误，不能有非数字！");
                            sc.next();
                            break;
                        }
                        se.update(a, n, newScore);
                        se.displayAllScore(a);
                    }
                case 5:
                    se.displayAllScore(a);
                   }

            }
        }
    }

