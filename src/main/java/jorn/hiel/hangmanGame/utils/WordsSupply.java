package jorn.hiel.hangmanGame.utils;

import jorn.hiel.hangmanGame.utils.enums.WordType;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public final class WordsSupply {

    private List<String> animals = Arrays.asList("alligator", "baboon", "badger", "bat", "bear", "beaver", "camel", "cat", "clam", "cobra", "cougar", "coyote", "crow", "cheetah", "deer", "dog", "donkey", "eagle", "ferret", "fox", "frog", "goat", "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose", "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon", "python", "rabbit", "rat", "raven", "rhino", "salmon", "seal", "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan", "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf", "wombat", "zebra");
    private List<String> movies = Arrays.asList("aladdin", "frozen");
    private List<String> cars = Arrays.asList("bmw", "audi", "ferrari", "chevrolet", "ford", "gmc", "honda", "hyundai", "infinity", "mazda", "buggati", "jeep", "kia", "lexus", "nissan", "porsche", "tesla", "toyota", "volkswagen");
    private List<String> sports = Arrays.asList("badminton", "baseball", "basketball", "football", "swimming", "rugby", "tennis", "wrestling", "volleyball", "soccer", "hockey", "golf");


    public String getWord(WordType type) {
    List<String> selection=null;

        switch (type) {
            case CAR -> selection=cars;
            case MOVIE -> selection=movies;
            case SPORT -> selection=sports;
            case ANIMAL -> selection=animals;
            }

            Collections.shuffle(selection);
        return selection.get(0);


        }


    }



