package Day14;

public class StarDemo{
    public static void main(String[] args){

       for(int i=1;i<=5;i++){//控制行数
           for (int k=1;k<=5-i;k++){//建立行数与空格的关系，输出空格
               System.out.print(" ");
           }
           for(int j=1;j<=2*i+1;j++){//每行的*，注意与行数的规律
               System.out.print("*");
           }
           System.out.println("");
       }

    }
}


