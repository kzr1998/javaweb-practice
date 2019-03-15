package Day15;

public class ArrayDemo1 {
    public static void main(String[] args){
        int []arr={6,12,15,17,67,43};
        for (int i=0;i<arr.length;i++){
        System.out.println("数组元素为："+arr[i]+" ");
    }
    for(int i:arr){
            System.out.println("使用增强型for循环："+i);
    }
    for(int i=0;i<arr.length;i++){
            if(arr[i]%3==0){
                System.out.println("能被3整除的数为："+arr[i]);
            }
    }
    }
}
