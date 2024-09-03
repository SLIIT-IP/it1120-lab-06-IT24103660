import java.util.Scanner;

public class IT24103660Lab6Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        double sumOfSquares = 0.0;
        int num;

        System.out.println("Enter positive integers (terminate input with -99):");

        while (true) {
            System.out.print("Enter a number: ");
            num = scanner.nextInt();

            if (num == -99) {
                break;
            } else if (num > 0) {
                sumOfSquares += num * num;
                count++;
            } else {
                System.out.println("Invalid input. Please enter a positive integer or -99 to terminate.");
            }
        }

        if (count > 0) {
            double rms = Math.sqrt(sumOfSquares / count);
            System.out.println("The Root Mean Square (RMS) is: " + rms);
        } else {
            System.out.println("No valid positive integers were entered.");
        }
    }
}
