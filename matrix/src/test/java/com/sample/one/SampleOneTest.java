package com.sample.one;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SampleOneTest {
  @Test
  public void testExample1() throws Exception {
    assertEquals(5, SampleOne.addExample(2,3));
  }
}
