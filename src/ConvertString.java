public class ConvertString {
    public static void main(String[] args) {
        // Create a String
        String str = "Hello";

        // Convert the String to a char Array
        char[] myCharArray = str.toCharArray();
        // Print the Array
        for(char i : myCharArray){
            System.out.println(i);
        }
    }
}
