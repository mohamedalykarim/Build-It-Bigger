package com.example.getfunnyjokelibrary;

import java.util.Random;

public class FunnyJoke {

    String[] jokes = {
            "Can a kangaroo jump higher than a house?\nOf course, a house doesn’t jump at all.",
            "teacher asks to a student that if I give you 3+3 rabbits, how many do you have?\nstudent tells, I will have 7 rabbits.\n teacher asks, how?\n student tells, i already have 1 rabbit.",
            "Do not be racist; be like Mario. He's an Italian plumber, who was made by the Japanese, speaks English, looks like a Mexican, jumps like a black man, and grabs coins like a Jew!",
            "When do you go at red and stop at green?\nnA: When you’re eating a watermelon.",
            "Q. Why is a bee's hair always sticky?\nA. Because it uses a honey comb!"
    };



    public String getRandomJoke(){
        String joke = "";
        Random random = new Random();
        joke = jokes[random.nextInt(5)];
        return joke;
    }
}
