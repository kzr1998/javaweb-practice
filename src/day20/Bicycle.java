package day20;

public class Bicycle extends NoMotor{
    public Bicycle(String name,String color) {
       super(name,color);


    }
    public String work(){
        String str="这是一辆"+this.getColor()+
                "颜色的，"+this.getName()+
                "牌的自行车。";
        return str;
    }
}
