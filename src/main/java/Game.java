
public class Game {

    private int total = 0;
    public void roll(int score) {
        total += score;
    }

    public int score() {
        return total;
    }
}
