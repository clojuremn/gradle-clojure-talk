package com.example;

import org.apache.commons.lang3.StringUtils;

public class MyClass {
  public static boolean isPalindrome(String str) {
    return str.equals(StringUtils.reverse(str));
  }
}
