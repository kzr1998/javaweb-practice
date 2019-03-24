package Day23.pack44;

public class Rectangle extends Shape {
    private double lenght;
    private double wide;

    public Rectangle(double lenght,double wide) {
        this.lenght=lenght;
        this.wide=wide;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getWide() {
        return wide;
    }

    public void setWide(double wide) {
        this.wide = wide;
    }

    @Override
    public double area() {
        return this.lenght*this.wide;
    }
}
