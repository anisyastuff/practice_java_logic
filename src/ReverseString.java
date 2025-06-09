import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        String reversedString = ""; // empty value
        for (int i = 0; i < s.length(); i++) {
            reversedString = s.charAt(i) + reversedString;
            System.out.println(reversedString);

        }
        System.out.print(reversedString);
    }
}
