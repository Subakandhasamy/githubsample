package com.sample;

import org.junit.jupiter.api.Test;
import sample.SampleTwo;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SampleTwoTest {
  @Test
  public void testExample2() throws Exception {
    assertEquals(3, SampleTwo.subExample(8,5));
  }
}
