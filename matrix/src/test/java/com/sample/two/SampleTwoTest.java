package com.sample.two;

import com.sample.two.SampleTwo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SampleTwoTest {
  @Test
  public void testExample2() throws Exception {
    assertEquals(3, SampleTwo.subExample(8,5));
  }
}
