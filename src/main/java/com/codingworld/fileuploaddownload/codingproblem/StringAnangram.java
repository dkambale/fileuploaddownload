package com.codingworld.fileuploaddownload.codingproblem;

import java.util.Arrays;

public class StringAnangram {

  public static void main(String[] args) {

    String st1 = "abcd";
    String st2 = "dcba";
    String st3="abcdf";

    //method1 with char array

    System.out.println(isStringsAnagram(st1, st2));

    //method2 with 256 char array
    System.out.println(isStringAnagram2(st1, st2));

    System.out.println(isStringAnagram2(st1, st3));

  }

  private static boolean isStringAnagram2(String st1, String st2) {
    int count=256;
    int[] chr = new int[count];
    if (st1.length() != st2.length()) {
      return false;
    }

    for (int i = 0; i < st1.length(); i++) {

      chr[st1.charAt(i)]++;
      chr[st2.charAt(i)]--;
    }
    for(int i=0;i<count;i++) {
      if(chr[i]>0) {
        return false;
      }
    }

    return true;
  }

  private static boolean isStringsAnagram(String st1, String st2) {

    if (st1.length() != st2.length()) {
      return false;
    }
    char[] arr1 = st1.toCharArray();
    char[] arr2 = st2.toCharArray();
    Arrays.sort(arr1);
    Arrays.sort(arr2);

    for (int i = 0; i < arr1.length; i++) {
      if (arr1[i] != arr2[i]) {
        return false;
      }
    }
    return true;
  }
}
