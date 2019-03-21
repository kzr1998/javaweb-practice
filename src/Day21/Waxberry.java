package Day21;

 final public class  Waxberry extends Fruits{
     private String color;

     public Waxberry(String shape,String taste,String color){
         super(shape,taste);
         this.color=color;
     }

     public String getColor() {
         return color;
     }

     public void setColor(String color) {
         this.color = color;
     }

     final public String face(){
         return "杨梅："+this.getColor()+","
         +this.getShape()+"果味酸甜适中";
     }
     public String eat(){
         return "杨梅酸甜适中，非常好吃！";
     }
     public String toString(){
         return "果实为"+this.getShape()+this.getColor()+this.eat();
     }
}
