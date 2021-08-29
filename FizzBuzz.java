import java.util.Scanner;
import java.util.Arrays;

public class FizzBuzz {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String value;
        int n, i = 0, j = 1;

        System.out.print("Input : n = ");
        n = userInput.nextInt();

        String[] arr = new String[n];

        System.out.print("Output : "); 

        for (; i < n; i++) {
            if (j % 3 == 0 && i % 5 == 0) {
                value = "FizzBuzz";
            } else if (j % 3 == 0) {
                value = "Fizz";
            } else if (j % 5 == 0) {
                value = "Buzz";
            } else {
                value = Integer.toString(j);
            }
            arr[i] = value;
            j++;
        }

        System.out.println(Arrays.toString(arr));
        userInput.close();
    }
}