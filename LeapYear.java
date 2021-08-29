import java.util.Scanner;
public class LeapYear {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Input ke - 1 : ");
        int input1 = userInput.nextInt();
        System.out.print("Input ke - 2 : ");
        int input2 = userInput.nextInt();

        System.out.println("Output : ");
        leapYear(input1, input2);
        userInput.close();
    }

    private static void leapYear(int input1, int input2) {
        int i = input1, n = input2;

        for (; i <= n; i++) {
            if (i % 4 == 0) {
                if (i % 100 == 0) {
                    if(i % 400 == 0) System.out.print(i + ", ");
                } else {
                    System.out.print(i + ", ");
                }
            } 
        }
    }
}