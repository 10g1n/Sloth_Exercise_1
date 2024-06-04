import java.util.ArrayList;
import java.util.Scanner;

public class CrazyFizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        ArrayList<String> list = new ArrayList<>();

        for (int num : arr) {

            String numVal;

            if (num % 3 == 0 && num % 5 == 0) {
                numVal = "FizzBuzz";
            } else if (num % 3 == 0) {
                numVal = "Fizz";
            } else if (num % 5 == 0) {
                numVal = "Buzz";
            } else {
                numVal = String.valueOf(num);
            }

            list.add(numVal);
        }

        System.out.println(list);

    }
}
