package edu.pdx.cs410J.numbers2words;

<<<<<<< HEAD
import org.junit.Test;

import static org.junit.Assert.assertEquals;
=======
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
>>>>>>> 0e4347d28f84fd463018f34cbe2f2611b7a5db8d

/**
 * Unit tests for the {@link NumbersToWords} class.
 */
public class NumbersToWordsTest {
<<<<<<< HEAD
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
=======

    private NumbersToWords ntw;

    @Before
    public void setUp() throws Exception {
        ntw = new NumbersToWords();
    }

    @Test(expected = IllegalArgumentException.class)
    public void doesNotSupportNonNumbers() {
        ntw.parse("chicken");
    }

    @Test
    public void testSingleStringToNumber(){
        assertThat(ntw.parse("1"), equalTo("One Dollar"));
    }

    @Test
    public void number2ReturnsTwo(){
        assertThat(ntw.parse("2"), equalTo("Two"));
    }
  
>>>>>>> 0e4347d28f84fd463018f34cbe2f2611b7a5db8d
}
