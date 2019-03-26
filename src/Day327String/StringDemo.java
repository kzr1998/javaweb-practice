package Day327String;

public class StringDemo {
    public static void main(String[] args) {
		/*已知字符串"abcdefg"，使之经过处理得到字符串"CDE",并进一步
        将“DE”替换为“MM”，得到结果：CMM */
       String str="abcdefg";
       str=str.substring(2,5);
       //System.out.println(str);
       str=str.toUpperCase();
       //System.out.println(str);
       str=str.replace("DE","MM");
        System.out.println(str);

    }
}
