package lab01;

import java.util.Scanner;

public class Analyze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Data data = new Data();

        while (true) {
            System.out.print("Enter number (Q to quit): ");

            if (scanner.hasNextDouble()) {
                double n = scanner.nextDouble();
                data.add(n);
            } else {
                String input = scanner.next();

                if (input.equalsIgnoreCase("Q")) {
                    break;
                } else {
                    System.out.println("Not a number!");
                }
            }
        }

        System.out.println("Average = " + data.getAverage());
        System.out.println("Maximum = " + data.getMax());

        scanner.close();
    }
}
