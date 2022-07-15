package jorn.hiel.hangmanGame;

import jorn.hiel.hangmanGame.utils.enums.WordType;

public class Game {


    public static void main(String[] args) {
        GameLogic logic=new GameLogic();

        logic.newGame(WordType.ANIMAL);

    }
}
