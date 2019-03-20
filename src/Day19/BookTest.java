package Day19;

public class BookTest {
    public static void main(String[] args){
        Book bk=new Book("红楼梦","曹雪芹","人民文学出版社",5.0);
        bk.message();
        System.out.println("----------------");
        System.out.println("----------------");
        Book bk1=new Book("小李飞刀","古龙","中国长安出版社",55.5);
        bk1.message();
    }
}
