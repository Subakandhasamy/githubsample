package com.sample.four;

import com.sample.one.SampleOne;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SampleFourTest {
  @Test
  public void testExample4() throws Exception {
    assertEquals(6, SampleOne.addExample(2,3));
  }
}
