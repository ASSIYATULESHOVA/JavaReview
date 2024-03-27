package week11_Review.ShapeTask;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(5.5,7.5);
        System.out.println(rectangle);
        System.out.println(rectangle.getName());
        System.out.println(rectangle.getLength());

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");

        Circle circle = new Circle(5);
        System.out.println(circle);
        System.out.println(circle.getName());
        System.out.println(circle.getRadius());
        System.out.println(circle.calcArea());
        System.out.println(circle.calcPerimeter());

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

      Cube cube = new Cube(5);
        System.out.println(cube);
        System.out.println(cube.calcArea());
        System.out.println(cube.calcPerimeter());


        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

      Cylinder cylinder = new Cylinder(4,2);
           System.out.println(cylinder);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        // PolyMor
  Shape shape;

        shape = new Circle(10.5);
        System.out.println(shape);
      System.out.println(((Circle) shape).getRadius());

      shape = new Cube(5.5);
        System.out.println(shape);


        shape= new Rectangle(30,40);
        System.out.println(shape);


        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Shape [] shapes = {circle, rectangle, cube, cylinder};

        for (Shape eacheShape : shapes) {
            System.out.println(eacheShape);
        }
        System.out.println(Arrays.toString(shapes));

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Volume shape2;

        shape2 = new Cube(2);
        System.out.println(shape2);
        











    }

}
