/*
 * Copyright 2021 StreamSets Inc.
 */

package com.streamsets.character.counter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharCounterTest {

  private CharCounter charCounter;

  @BeforeEach
  public void testCharCounter() {
    this.charCounter = new CharCounter();
  }

  @Test
  public void testSimpleString() {
    String simpleString = "A test string for the interview";
    assertEquals(5, charCounter.getCharOccurences(simpleString, 't'));
  }

  @Test
  public void testMultipleQueries() {
    String simpleString = "A test string for the interview";
    assertEquals(5, charCounter.getCharOccurences(simpleString, 't'));
    assertEquals(2, charCounter.getCharOccurences(simpleString, 's'));
    assertEquals(1, charCounter.getCharOccurences(simpleString, 'w'));
  }
}
