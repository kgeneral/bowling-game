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
            if(isStrike(firstFrame)) {
                score += 10 + rolls[firstFrame + 1] + rolls[firstFrame + 2];
                firstFrame += 1;
            } else if(isSpare(firstFrame)) {
                score += 10 + rolls[firstFrame + 2];
                firstFrame += 2;
            } else {
                score += rolls[firstFrame] + rolls[firstFrame + 1];
                firstFrame += 2;
            }
        }
        return score;
    }

    private boolean isSpare(int frame) {
        return rolls[frame] + rolls[frame + 1] == 10;
    }

    private boolean isStrike(int frame) {
        return rolls[frame] == 10;
    }
}
