import java.util.Scanner;
public class Palindrome {
    
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String kata, p = "", hasil;
        int n, i;

        System.out.print("Masukan Kata : ");
        kata = userInput.nextLine();

        n = kata.length();

        for ( i = n - 1; i >= 0; i--) {
            p += kata.charAt(i);
        }

        hasil = (kata.equals(p)) ? "palindrome" : "not palindrome";
        System.out.println(kata + " # --> " + hasil);
        userInput.close();
    }
}
