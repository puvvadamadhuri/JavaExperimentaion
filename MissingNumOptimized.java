import java.util.*;

public class MissingNumOptimized {
    public static void main(String[] args) {
        // initializations
        int n;
        List<Integer> numbers = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);

        // Logic
        System.out.println("Enter the Number of digits in the Sequence:");
        n = scanner.nextInt();
        for (int i = 0; i < n - 1; i++) {
            System.out.print("Enter the Number:");
            numbers.add(scanner.nextInt());

        }
        // Printing
        // for (int i = 0; i < numbers.size(); i++) {
        // System.out.print(numbers.get(i));
        // }
        int natsum = n*(n+1)/2;
        for (int i = 0; i < n - 1; i++) {
            natsum-= numbers.get(i);

        }

        System.out.println("Missing Number "+natsum);
        //System.out.println(userprovidedsum);

        scanner.close();

    }

}
