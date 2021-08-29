import java.util.Scanner;
public class ReverseWords {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String kataInput;

        System.out.print("Input kata : ");
        kataInput = userInput.nextLine();

        System.out.print("Output : ");
        System.out.println(reverseWords(kataInput));
        userInput.close();
    }

    public static String reverseWords(String input) {
        String[] kata = input.split("\\s");
        String reverseWord = "";

        for (String w:kata) {
            StringBuilder sb = new StringBuilder(w);
            sb.reverse();
            reverseWord += sb.toString()+" ";
        }
        return reverseWord.trim();
    }
}