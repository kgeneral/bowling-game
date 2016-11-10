import org.junit.Before;
import org.junit.Test;

import java.util.stream.IntStream;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class BowlingTest {

    Game game;

    @Before
    public void setUp() {
        game = new Game();
    }

    @Test
    public void gutterGame() {
        roll(20, 0);
        assertThat(game.score(), is(0));
    }

    @Test
    public void allOnes() {
        roll(20, 1);
        assertThat(game.score(), is(20));
    }

    private void roll(int rolls, int pins) {
        IntStream.rangeClosed(1, rolls).forEach(value -> game.roll(pins));
    }
}
