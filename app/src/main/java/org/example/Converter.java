package org.example;

public class Converter {

  // Converts ounces to pounds as a decimal
  public String toPounds(int ounces) {
    double pounds = ounces / 16.0;
    return String.format("%.4f %s", pounds, pounds == 1.0 ? "lb" : "lbs");
  }

  // Converts ounces to pounds and leftover ounces
  public String toPoundsAndOunces(int ounces) {
    int pounds = ounces / 16;
    int leftoverOunces = ounces % 16;
    return String.format("%d %s %d oz", pounds, pounds == 1 ? "lb" : "lbs", leftoverOunces);
  }
}
