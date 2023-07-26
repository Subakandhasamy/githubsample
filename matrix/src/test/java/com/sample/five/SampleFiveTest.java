package com.sample.five;

import com.sample.one.SampleOne;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SampleFiveTest {
  @Test
  public void testExample5() throws Exception {
    assertEquals(1, SampleOne.addExample(10,3));
  }
}
