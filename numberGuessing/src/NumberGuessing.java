import java.util.Random;

public class NumberGuessing{
    private final int targetNumber;
    private int attempts;
    private final int maxAttempts;
    private boolean hasWon;

    public NumberGuessing(int maxAttempts) {
        Random random = new Random();
        this.targetNumber = random.nextInt(100) + 1;
        this.maxAttempts = maxAttempts;
        this.attempts = 0;
        this.hasWon = false;
    }

    public String checkGuess(int guess) {
        attempts++;
        if (guess == targetNumber) {
            hasWon = true;
            return "Correct!";
        } else if (guess < targetNumber) {
            return "Too low.";
        } else {
            return "Too high.";
        }
    }

    public String getRating() {
        if (!hasWon) return "Better luck next time! The number was " + targetNumber;

        return switch (attempts) {
            case 1 -> "Legendary!";
            case 2 -> "Excellent!";
            case 3, 4 -> "Good!";
            case 5 -> "Close!";
            default -> "You finished!";
        };
    }


    public boolean canPlay() {
        return attempts < maxAttempts && !hasWon;
    }

    public boolean isHasWon() {
        return hasWon;
    }

    public int getAttempts() {
        return attempts;
    }
}