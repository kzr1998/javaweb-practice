package Day15;

public class ArrayDemo2 {
    public static void main(String[] args) {
        char[] ch={'a','b','A','a','A','t','f','g'};
        System.out.println("字符数组：");
        for(char n:ch){
            System.out.print(n+" ");
        }
        System.out.println();
        int sum=0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='a'|ch[i]=='A'){
                sum=sum+1;
            }
        }
        System.out.println("出现'a'或'A'的次数为："+sum);
        }
     }


