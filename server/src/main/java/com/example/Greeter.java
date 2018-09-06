package com.example;

/**
 * This is a class.
 */
public class Greeter {
  /**
   * This is a constructor.
   */
  public Greeter() {

  }
  /**
  *this is methode greet
  *@param string someone
  *@return string
  */
  public String greet(String someone) {
    return String.format("Hello, %s!", someone);
  }
}
