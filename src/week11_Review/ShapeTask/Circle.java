package week11_Review.ShapeTask;

public class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        setRadius(radius);
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return (getRadius() * getRadius()) * Math.PI;
    }

    @Override
    public double calcPerimeter() {
        return 2 * getRadius() * Math.PI;
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle with the radius of "+ getRadius());
    }
}
