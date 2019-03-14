package Day14;

public class jiechengPlus {
    public static void main(String[] args){
        int sum=0;
        for(int i=1;i<=4;i++){
            int s=1;
            for(int j=1;j<=i;j++){
                s=s*j;//阶乘: 1*1,1*2,1*2*3,1*2*3*4
            }
            sum+=s;
        }
        System.out.println(sum);
    }
}
