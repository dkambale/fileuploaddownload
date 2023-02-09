package com.codingworld.fileuploaddownload.codingproblem;

public class StringReverse {

  public static void main(String[] args) {

    String str = "Coding World";

    // StringBuilder

    StringBuilder sb = new StringBuilder();

    for (int i = str.length() - 1; i >= 0; i--) {

      sb.append(str.charAt(i));
    }
    System.out.println("Using String Builder : " + sb.toString());

    // using recursion

    String st = reverseString(str);
    System.out.println("Using String recursion : " + st);
  }

  private static String reverseString(String str) {

    if (str == null || str.length() == 0) {
      return "";
    }

    return str.charAt(str.length() - 1) + reverseString(str.substring(0, str.length() - 1));
  }
}
