package week11_Review.ShapeTask;
public class Rectangle extends Shape{
    private double width , length;
    public Rectangle(double width, double length) {
       setLength(length);
       setWidth(width);
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    @Override
    public double calcArea() {
        return width * length;
    }
    @Override
    public double calcPerimeter() {
        return 2 * (length * width);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle with the length of "+getLength()+ " and with the width of "+getWidth());
    }


}
