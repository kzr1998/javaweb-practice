package day20;

public class NoMotor {
    private String name;
    private String color;
    private int lunzi=2;
    private int zuoyi=1;

    public NoMotor() {

    }

    public NoMotor(String name,String color) {
        this.name=name;
        this.color = color;
    }

    public NoMotor(String name,String color,int lunzi,int zuoyi) {
        this.name=name;
        this.color = color;
        this.lunzi=lunzi;
        this.zuoyi = zuoyi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLunzi() {
        return lunzi;
    }

    public void setLunzi(int lunzi) {
        this.lunzi = lunzi;
    }

    public int getZuoyi() {
        return zuoyi;
    }

    public void setZuoyi(int zuoyi) {
        this.zuoyi = zuoyi;
    }
    public String work(){
        String str="这是一辆"+this.getColor()+
                "颜色的，"+this.getName()+
                "牌的非机动车，有"+this.getLunzi()+"个轮子，有"+this.getZuoyi()+"个座椅的非机动动车。";
        return str;
    }
}
