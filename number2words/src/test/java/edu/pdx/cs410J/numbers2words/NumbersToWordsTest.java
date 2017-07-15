package edu.pdx.cs410J.numbers2words;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Unit tests for the {@link NumbersToWords} class.
 */
public class NumbersToWordsTest {
  
  @Test(expected = UnsupportedOperationException.class)
  public void getArrivalStringNeedsToBeImplemented() {
    NumbersToWords flight = new NumbersToWords();
    flight.getArrivalString();
  }

  @Test
  public void initiallyAllFlightsHaveTheSameNumber() {
    NumbersToWords flight = new NumbersToWords();
    assertThat(flight.getNumber(), equalTo(42));
  }

  @Test
  public void forProject1ItIsOkayIfGetDepartureTimeReturnsNull() {
    NumbersToWords flight = new NumbersToWords();
    assertThat(flight.getDeparture(), is(nullValue()));
  }
  
}
