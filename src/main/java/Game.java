public class Game {

    private static int FRAMES = 10;
    private int[] rolls = new int[21];
    private int currentRoll = 0;
    public void roll(int pins) {
        rolls[currentRoll++] = pins;
    }

    public int score() {
        int score = 0;
        int roll = 0;
        for(int frame = 0; frame < FRAMES; frame++) {
            score += rolls[roll] + rolls[roll + 1];
            if(rolls[roll] + rolls[roll + 1] == 10)
                score += rolls[roll + 2];

            roll += 2;
        }
        return score;
    }
}
