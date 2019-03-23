package Day23;

public class Circle extends Shape{
    private double r;

    public Circle(double r) {
        this.r=r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        return this.r*this.r*Math.PI;
    }
}
