package MissingNum;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

class Main {
    public static void main(String[] args) {
        // initializations
        int n;
        List<Integer> numbers = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);

        // Logic
        System.out.println("Enter the Number of digits in the Sequence6:");
        n = scanner.nextInt();
        for (int i = 0; i < n - 1; i++) {
            System.out.print("Enter the Number:");
            numbers.add(scanner.nextInt());

        }
        // Printing
        // for (int i = 0; i < numbers.size(); i++) {
        // System.out.print(numbers.get(i));
        // }

        for (int i = 1; i < n + 1; i++) {
            //Boolean flag = true;
            for (int j = 0; j < n - 1; j++) {
                if (i == numbers.get(j)) {
                    //flag = false;
                    break;
                }

                if ( j == n - 2) {
                    System.out.println("Number thats missing from the sequence is: " + i);
                }

            }
        }
        scanner.close();

    }
}