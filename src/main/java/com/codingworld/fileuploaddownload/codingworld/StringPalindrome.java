package com.codingworld.fileuploaddownload.codingproblem;

public class StringPalindrome {

  public static void main(String[] args) {
    String str1="abccba";
    String str2="aba";
    String str3="abcdfc";

    System.out.println(isStringPalindrome(str1));
    System.out.println(isStringPalindrome(str2));
    System.out.println(isStringPalindrome(str3));
  }

  private static boolean isStringPalindrome(String str1) {

    if(str1==null) {
      return false;
    }
    int left=0; int right=str1.length()-1;

    while(left<=right){

      if(str1.charAt(left)==str1.charAt(right)) {

        left++;
        right--;
      } else {
        break;
      }
    }
    if(left<right) {
      return false;
    }
    return true;
  }
}
