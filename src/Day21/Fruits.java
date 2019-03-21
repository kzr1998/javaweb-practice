package Day21;

public class Fruits {
    private String shape;
    private String taste;

    public Fruits() {

    }
    public Fruits(String shape,String taste) {
     this.shape=shape;
     this.taste=taste;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }
    public String eat(){
        return "水果可供人们食用";
    }
    public boolean equals(Object object){
        if (object == null){
            return false;
        }
        Fruits temp = (Fruits) object;
        if (this.getShape().equals(temp.getShape()) && this.getTaste().equals(temp.getTaste())){
            return true;
        }else {
            return false;
        }
    }
}
