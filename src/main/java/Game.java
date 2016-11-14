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
                score += 10 + nextTwoBallsForStrike(firstFrame);
                firstFrame += 1;
            } else if(isSpare(firstFrame)) {
                score += 10 + nextBallForSpare(firstFrame);
                firstFrame += 2;
            } else {
                score += nextBallsInFrame(firstFrame);
                firstFrame += 2;
            }
        }
        return score;
    }

    private int nextTwoBallsForStrike(int frame) {
        return rolls[frame + 1] + rolls[frame + 2];
    }

    private int nextBallForSpare(int frame) {
        return rolls[frame + 2];
    }

    private int nextBallsInFrame(int frame) {
        return rolls[frame] + rolls[frame + 1];
    }

    private boolean isSpare(int frame) {
        return rolls[frame] + rolls[frame + 1] == 10;
    }

    private boolean isStrike(int frame) {
        return rolls[frame] == 10;
    }
}
