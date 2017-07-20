package edu.pdx.cs410J.numbers2words;

public class NumbersToWords {

    public String parse(String input) throws IllegalArgumentException {

        if(input.equals("1")) {
            return "One Dollar";
        }
        throw new IllegalArgumentException("Bad argument: " + input);
    }
}
