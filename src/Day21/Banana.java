package Day21;

public class Banana extends Fruits {
    private String variety;
    private String color;
    public Banana(String shape, String taste, String variety,String color) {
        super(shape, taste);
        this.variety=variety;
        this.color=color;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String advantage(){
        return "果形"+this.getShape()+","+"果肉香甜，可供生食。";
    }
    public String advantage(String color){
        return "颜色为："+this.getColor();
    }
}
