package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestConverter {

  private Converter converter;

  @BeforeEach
  void setUp() {
    converter = new Converter();
  }

  @Test
  public void testToPounds() {
    assertEquals("0.0000 lbs", converter.toPounds(0));
    assertEquals("0.0625 lbs", converter.toPounds(1));
    assertEquals("1.0000 lb", converter.toPounds(16));
    assertEquals("3.8750 lbs", converter.toPounds(62));
  }

  @Test
  public void testToPoundsAndOunces() {
    assertEquals("0 lbs 0 oz", converter.toPoundsAndOunces(0));
    assertEquals("0 lbs 1 oz", converter.toPoundsAndOunces(1));
    assertEquals("1 lb 0 oz", converter.toPoundsAndOunces(16));
    assertEquals("3 lbs 14 oz", converter.toPoundsAndOunces(62));
  }
}

