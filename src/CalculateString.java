import java.util.Scanner;

public class CalculateString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();

        int countString = s.split("\\s").length;
        System.out.println("The length of the string is: " + countString);

    }
}
