package com.codingworld.fileuploaddownload.codingproblem;

public class RemoveCharFromString {

  public static void main(String[] args) {

    String str = "Coding World";

    char removeChar = 'W';

    String remainingStr = removeChar(str, removeChar);
    System.out.println(remainingStr);
  }

  private static String removeChar(String str, char removeChar) {

    int charIndex = str.indexOf(removeChar);
    return str.substring(0, charIndex) + str.substring(charIndex + 1, str.length());
  }
}
