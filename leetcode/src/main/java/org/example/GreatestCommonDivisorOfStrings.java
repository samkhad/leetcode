package org.example;

public class GreatestCommonDivisorOfStrings {

    public static String gcdOfStrings(String str1, String str2) {
       int n1 = str1.length();
       int n2 = str2.length();
       if(n1<n2) return gcdOfStrings(str2, str1);
       if(str1.equals(str2)) return str1;
       if(str1.startsWith(str2)) return gcdOfStrings(str1.substring(n2), str2);
       return "";


    }

    public static void main(String[] args) {
    String str1 = "ABCABC", str2 = "ABC";
        System.out.println(gcdOfStrings(str1, str2));
//        Output: "ABC"
//        Example 2:
//
    String  str11 = "ABABAB", str21 = "ABAB";
        System.out.println(gcdOfStrings(str11, str21));
//        Output: "AB"
//        Example 3:
//
        String str31 = "LEET", str32 = "CODE";
//        Output: ""
        System.out.println(gcdOfStrings(str31, str32));
    }
}
