package week06_Review;

public class NestedLoop2 {

    public static void main(String[] args) throws InterruptedException {

        for (int i = 15; i >= 1; i--) {

            for (int j = 59; j >= 0 ; j--) {

                for (int k = 999; k >= 0 ; k--) {
                    System.out.print( "\r"+(i-1) + " minutes " + j + " seconds " + k + " millisecond" );
                    Thread.sleep(1);
                }

            }

        }



        System.out.println("\n\n");

        System.err.println("\t\t\t* * * * * * * * * * * * * * * * * * * * * * * * * *");
        System.err.println("\t\t\t*                                                 *");
        System.err.println("\t\t\t*       Times is Up, Please take your seats!      *");
        System.err.println("\t\t\t*                                                 *");
        System.err.println("\t\t\t* * * * * * * * * * * * * * * * * * * * * * * * * *");



    }

}
