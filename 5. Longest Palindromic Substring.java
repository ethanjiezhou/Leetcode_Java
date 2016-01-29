public class Solution {
    public String longestPalindrome(String s) {
        if(s == null)
            return "";
        if(s.length() == 1)
            return s;

        String longest = s.substring(0, 1);

        for(int i = 0; i < s.length(); i++) {
            String temp = helper(s, i, i);
            if(temp.length() > longest.length())
                longest = temp;

            temp = helper(s, i, i+1);
            if(temp.length() > longest.length())
                longest = temp;
        }
        return longest;
    }

    public String helper(String s, int start, int end) {
        while(start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            start--;
            end++;
        }
        return s.substring(start + 1, end);
    }
}