package jorn.hiel.hangmanGame.pojo;

import lombok.Getter;

public class Player {

    @Getter
    private final String name;

    @Getter
    int score;


    public Player(String name) {
        this.name = name;
        this.score=0;
    }

    public void addScore(int score) {
        this.score+=score;
    }

    public void resetScore() {
        this.score=0;
    }


}
