package Day327baozhuang;

public class HelloWorld1 {
    public static void main(String[] args) {
        //定义float类型变量，赋值为88.99
        float f1 =88.99f;
        //将基本类型转换为字符串
        String s=Float.toString(f1);
        s+=20;
        //打印输出
     System.out.println("f1转换为String型后与整数20的求和结果为："+s);
        //定义String类型变量，赋值为"188.55"
        String str = "188.55";
        // 将字符串转换为基本类型double
       Double b=Double.parseDouble(str);
       b+=20;
        //打印输出
     System.out.println("str转换为double型后与整数20的求和结果为"+b);
    }
}
