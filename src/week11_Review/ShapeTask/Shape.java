package week11_Review.ShapeTask;

import java.text.DecimalFormat;

public abstract class Shape {

    private final String name;

    public Shape() {
        name= getClass().getSimpleName();
    }   //CONSTRUCTOR

    public String getName() {
        return name;
    }       //getNAME

    public abstract double calcArea();                  //calcAREA
    public abstract double calcPerimeter();             //calcPERIMETER
    public abstract void draw();

    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return name + "{" +
                "area = " + df.format(calcArea() ) + '\'' +
                "perimeter =" + df.format( calcPerimeter()) + '\'' +

                '}';
    }                             //ToSTRING
}