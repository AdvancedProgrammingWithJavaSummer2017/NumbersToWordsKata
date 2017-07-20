package edu.pdx.cs410J.numbers2words;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit tests for the {@link NumbersToWords} class.
 */
public class NumbersToWordsTest {
    @Test
    public void ontToTwentyShouldReturn() throws Exception {
        NumbersToWords converter = new NumbersToWords();
        assertEquals("Zero", converter.convert(0));
        assertEquals("One", converter.convert(1));
        assertEquals("Two", converter.convert(2));
        assertEquals("Three", converter.convert(3));
    }

    @Test
    public void canCount() throws Exception {

    }
}
