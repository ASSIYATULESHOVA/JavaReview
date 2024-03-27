package week11_Review.ShapeTask;

import java.text.DecimalFormat;

public class Cube extends Shape implements Volume {

    private double side;
    public Cube(double side) {
       setSide(side);
    }
    public double calcVolume(){
        return getSide() * getSide() * getSide();
   }
    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }
    @Override
    public double calcArea() {
        return 6 * (getSide() * getSide());
    }
    @Override
    public double calcPerimeter() {
        return 12 *getSide();
    }
    @Override
    public void draw() {
        System.out.println("Drawing cube with the side of  "+getSide());
    }



    @Override
    public String toString() {
        return super.toString().replace("}",", volume = "+calcVolume());
    }
}
