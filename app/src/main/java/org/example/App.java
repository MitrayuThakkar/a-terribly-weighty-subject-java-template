package org.example;

public class App {
  public static void main(String[] args) {
    Converter converter = new Converter();
    System.out.println("Welcome to the Ounce Conversion Program!");

    // Example usage
    int ounces = 62; // Replace this with user input if needed
    System.out.println(ounces + " oz is equivalent to:");
    System.out.println(converter.toPoundsAndOunces(ounces)); // Example: "3 lbs 14 oz"
    System.out.println(converter.toPounds(ounces));         // Example: "3.8750 lbs"

    System.out.println("Thank you for using the OCP!");
  }
}
