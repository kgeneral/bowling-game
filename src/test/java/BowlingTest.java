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
    public void canRoll() {
        IntStream.range(1, 20).forEach(value -> game.roll(0));
        assertThat(game.score(), is(0));
    }
}
