public class MaxScore {
    public static void main(String[] args) {

        int maxScore = 500;
        int userScore = 423;
        // Calculate the percentage of the user's score in relation to the maximum available score
        float percentage = (float) userScore / maxScore * 100.0f;
        System.out.println("User's percentage is " + percentage);

    }
}
