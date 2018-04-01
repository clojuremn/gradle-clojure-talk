package com.example;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyClassTest {
  @Test
  public void testPalindrome() {
    assertTrue(MyClass.isPalindrome("racecar"));
  }

  @Test
  public void testPalindrome2() {
    assertTrue(MyClass.isPalindrome("not a palindrome"));
  }
}
