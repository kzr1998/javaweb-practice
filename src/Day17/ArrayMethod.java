package Day17;

public class ArrayMethod {
    public void printhArray(int[]arr){//此方法打印数组元素的值
        for(int n:arr){
            System.out.print(n+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int []arr={10,45,78,90,45};
        ArrayMethod am=new ArrayMethod();
        am.printhArray(arr);
    }
}
