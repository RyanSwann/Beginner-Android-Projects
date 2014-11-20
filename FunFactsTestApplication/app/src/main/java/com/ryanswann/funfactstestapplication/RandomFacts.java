package com.ryanswann.funfactstestapplication;


import java.util.Random;

/**
 * Created by Ryansb on 20/11/2014.
 */
public class RandomFacts {

    public String GetFact() {

        //Array holding facts.
        String[] facts = {
                "My name is Ryan Swann",
                "I am 22 years of age.",
                "I live in Aylesbury"
        };

        String fact = "";

        Random randomGenerator = new Random();
        int randNumb = randomGenerator.nextInt(facts.length); // Random number within length of facts array

        fact = facts[randNumb]; //Assign 'fact' to a random chosen fact.

        return fact;

    }
}
