public class Solution {
    public String reverseString(String s) {
        char[] letter = s.toCharArray();
        int begin = 0;
        int end = s.length() - 1;
        while(begin < end) {
            char temp = letter[begin];
            letter[begin] = letter[end];
            letter[end] = temp;
            begin++;
            end--;
        }
        return new String(letter);
    }
}

/*
public class Solution {
    public String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
*/