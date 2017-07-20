package edu.pdx.cs410J.numbers2words;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Unit tests for the {@link NumbersToWords} class.
 */
public class NumbersToWordsTest {

    @Test(expected = IllegalArgumentException.class)
    public void doesNotSupportNonNumbers() {
        NumbersToWords ntw = new NumbersToWords();

        String word = ntw.parse("chicken");
    }
  
}
