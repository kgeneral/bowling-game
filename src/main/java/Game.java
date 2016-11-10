public class Game {

    private static int FRAMES = 10;
    private int[] rolls = new int[21];
    private int currentRoll = 0;
    public void roll(int pins) {
        rolls[currentRoll++] = pins;
    }

    public int score() {
        int score = 0;
        int firstFrame = 0;
        for(int frame = 0; frame < FRAMES; frame++) {
            score += rolls[firstFrame] + rolls[firstFrame + 1];
            if(rolls[firstFrame] + rolls[firstFrame + 1] == 10)
                score += rolls[firstFrame + 2];

            firstFrame += 2;
        }
        return score;
    }
}
