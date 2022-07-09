
import java.util.Scanner;

public class CtoF {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double tempCelsius = 0;
        double tempFahrenheint = 0;
        String trash = "";
        boolean done = true;

        do {
            System.out.print("Enter the temperature in Celsius value: ");
            if (in.hasNextDouble()) {
                tempCelsius = in.nextDouble();
                in.nextLine();
                tempFahrenheint = 32 + (tempCelsius * 9 / 5);
                System.out.println("The temperature you entered from celsius to fahrenheit is: " + tempFahrenheint);
                done = false;
            }
            else {
                trash = in.nextLine();
                System.out.println("The temperature you entered is invalid: " + trash + " .TRY AGAIN !!!");
                done = true;
            }
        } while(done);
    }
}
