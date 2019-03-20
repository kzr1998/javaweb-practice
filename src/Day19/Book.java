package Day19;

public class Book {
    private String title;//书名
    private String author;//作者
    private String press;//出版社
    private double price;//价格

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor(){
         return author;
     }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price>10) {
            this.price = price;
        }else{
            System.out.println("价格无效,必须大于10");
             this.price=10.0;
        }

    }
    public Book(String title,String author,String press,double price){
        this.title=title;
        this.author=author;
        this.press=press;
        this.setPrice(price);
    }
    public void message(){
         System.out.println("书名："+this.getTitle());
        System.out.println("作者："+this.getAuthor());
        System.out.println("出版社："+press);
        System.out.println("价格："+price);
    }
}

