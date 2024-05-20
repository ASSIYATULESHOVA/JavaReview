package week06_Review;

public class NestedLoop {

    public static void main(String[] args) throws InterruptedException {

        for (int i = 15; i >= 1; i--) {

            for (int j = 59; j >= 0 ; j--) {
                /*
                if(i > 2){
                    System.out.println( (i-1) + " minutes " + j + " seconds");
                }else {
                    System.out.println((i - 1) + " minute " + j + " seconds");
                }

                */
                System.out.print( "\r" + (i-1) + " minutes " + j + " seconds");
                Thread.sleep(1000);

            }

        }



    }
}
