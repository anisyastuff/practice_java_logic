import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first number: ");
        int firstNum = input.nextInt();
        System.out.println("Please enter your second number: ");
        int secondNum = input.nextInt();

        //Calculate
        int sum = firstNum + secondNum;
        System.out.println("The sum is: " + sum);

    }
}
