package UtilTests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import jorn.hiel.hangmanGame.utils.enums.WordType;
import jorn.hiel.hangmanGame.utils.WordsSupply;

import static org.junit.jupiter.api.Assertions.*;


public class WordsSupplyTest  {

    WordsSupply supply;

    @BeforeEach
    void setup(){
        supply = new WordsSupply();
    }

    @Test
    void doesExist()
    {
        assertNotNull(supply);
    }

    @Test
    void canGenerate()
    {
        String car=supply.getWord(WordType.CAR);
        String movy=supply.getWord(WordType.MOVIE);
        String animal=supply.getWord(WordType.ANIMAL);
        String sport=supply.getWord(WordType.SPORT);

        assertNotNull(car);
        assertNotNull(movy);
        assertNotNull(animal);
        assertNotNull(sport);

        assertNotEquals(car,movy);
        assertNotEquals(sport,animal);
        assertNotEquals(animal,car);

    }

}
