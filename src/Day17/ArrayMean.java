package Day17;

public class ArrayMean {
        public void print(double[]arr){
            double sum=0;
            double avg=0;
           for(double n:arr){
               sum+=n;
           }
            avg= sum/arr.length;
            System.out.println("数组的平均值为："+avg);
        }
        public static void main(String[] args){
            double arr[]={78.5,98.5,65.5,32.5,75.5};
           ArrayMean am=new ArrayMean();
           am.print(arr);

        }
    }

