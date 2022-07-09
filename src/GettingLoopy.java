

public class GettingLoopy {

    public static void main(String[] args) {

        int countP = 0;
        int countM = 30;
        int countPP = 0;
        int countDown = 10;
        int rows = 5;
        int cols = 5;

        while (countP <= 30)
            {
                System.out.print(" " + countP);
                countP++;
            }
        System.out.println();

        while (countM >= 0)
        {
            System.out.print(" " + countM);
            countM--;
        }
        System.out.println();

        while (countPP <= 18)
        {
            System.out.print(" " + countPP);
            countPP = countPP + 3;
        }
        System.out.println();

        while (countDown >= 0)
        {
            System.out.print(" " + countDown);
            countDown = countDown - 2;
        }
        System.out.println();

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println();

       for (int i = 1; i <= rows; i++) {

            for (int j = 5; j >= i; j--)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println();

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= cols; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }

        // write your code here
    }
}
