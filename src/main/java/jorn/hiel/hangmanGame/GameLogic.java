package jorn.hiel.hangmanGame;

import jorn.hiel.hangmanGame.utils.WordsSupply;
import jorn.hiel.hangmanGame.utils.enums.WordType;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class GameLogic {


    private String word="";
    private WordsSupply wordsSupply;


    public void newGame(WordType type){
        if (wordsSupply ==null){wordsSupply=new WordsSupply();}

        word= wordsSupply.getWord(type);
        log.debug("Word set to > " + word);






    }






}
