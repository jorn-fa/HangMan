import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import jorn.hiel.hangmanGame.pojo.Player;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PlayerTest {

    Player player;
    final String NAME="jorn";

    @BeforeEach
    void setup(){
        player = new Player(NAME);
    }

    @Test
    void doesExist()
    {
        assertNotNull(player);
    }

    @Test
    void checkInitialData(){
        assertEquals(0, player.getScore());
        assertEquals(NAME,player.getName());
    }

    @Test
    void canAddScore(){
        assertEquals(0, player.getScore());
        player.addScore(5);
        assertEquals(5, player.getScore());
        player.resetScore();
        player.addScore(10);
        player.addScore(5);
        assertEquals(15, player.getScore());
    }



}
