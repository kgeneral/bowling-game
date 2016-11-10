
public class Game {

    private int score = 0;
    // TODO : 잘못된 책임 할당(misplaced responsibility)이 디자인 원칙, 잘못된 디자인 냄새이다.
    public void roll(int pins) {
        score += pins;
    }

    public int score() {
        return score;
    }
}
