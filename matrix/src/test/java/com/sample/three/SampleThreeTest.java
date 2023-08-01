package com.sample.three;

import com.sample.three.SampleThree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SampleThreeTest {
  @Test
  public void testExample3() throws Exception {
    assertEquals(1, SampleThree.divExample(6,6));
  }
}
