package org.example;

public class ReverseVowelsOfAString {
    public static String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            while (start < end && !isVowel(ch[start])) {
                start++;
            }

            while (start < end && !isVowel(ch[end])) {
                end--;
            }
            if (start < end) {
                swapCall(ch, start, end);
                start++;
                end--;
            }
        }

        return new String(ch);
    }

    private static void swapCall(char[] ch, int start, int end) {
        char temp = ch[start];
        ch[start] = ch[end];
        ch[end] = temp;
    }

    private static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }

    public static void main(String[] args) {
        String s = "apipeuole";
        String res = ReverseVowelsOfAString.reverseVowels(s);
        System.out.println(res);
    }
}
