package week03_Review;

public class Operators {
    public static void main(String[] args) {

        // Arithmetic:
        System.out.println(100 - 10);
        System.out.println(100 + 10.0);
        System.out.println(2.5 * 2);
        System.out.println(30 / 4); //7
        System.out.println(30d / 4);
        System.out.println(30 % 4);

        // Shorthand:
        int x = 100;

        x += 200;  // x = x + 100

        System.out.println(x);

        x -= 50;

        System.out.println(x);

        x *= 4;

        System.out.println(x);

        x /= 2;

        System.out.println(x);

        x %= 3;

        System.out.println(x);

        //Unary:
        System.out.println(-10000 + 2000); // -8000

        int y = 30;

        System.out.println(++y); // y =  31

        System.out.println(--y); //y = 30

        int z = 20;

        System.out.println(z++); // 20,  z = 21

        int q = 40;

        System.out.println(q--); //40, q = 39


        //Relational:
        System.out.println(100 > 200);
        System.out.println(1000 < 2000);

        System.out.println( 50 >= 50);
        System.out.println(80 <= 70);

        System.out.println(100 == 200);

        System.out.println(100 != 200);


        //Logical:
        System.out.println( 100 > 90 && 80 < 50);
        //                   true && false

        System.out.println( 100 > 90 || 80 < 50);

        System.out.println( 10 == 11  || 10 != 10);
        //                  false  ||  false

        System.out.println(!true);



        System.out.println(  1 > 2 & 10 > 1 );


        System.out.println( 10 > 5 | 100 < 2);




    }
}
