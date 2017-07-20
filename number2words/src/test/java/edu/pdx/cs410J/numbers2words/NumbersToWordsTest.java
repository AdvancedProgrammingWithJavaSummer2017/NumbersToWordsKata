package edu.pdx.cs410J.numbers2words;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Unit tests for the {@link NumbersToWords} class.
 */
public class NumbersToWordsTest {

    @Test(expected = IllegalArgumentException.class)
    public void doesNotSupportNonNumbers() {
        NumbersToWords ntw = new NumbersToWords();
        ntw.parse("chicken");
    }

    @Test
    public void testSingleStringToNumber(){
        NumbersToWords ntw = new NumbersToWords();
        assertThat(ntw.parse("1"), equalTo("One Dollar"));
    }
  
}
