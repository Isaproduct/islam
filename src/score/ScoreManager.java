package score;

public class ScoreManager {
    private int score = 0;

    public void updateScore(int points) {
        score += points;
        System.out.println("Score updated: " + score);
    }
}