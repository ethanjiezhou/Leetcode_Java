public class Solution {
    public String reverseVowels(String s) {
        int start = 0;
        int end = s.length() - 1;
        String vowels = "aeiouAEIOU";
        char[] chars = s.toCharArray();
        
        while(start < end) {
            while(start < end && !vowels.contains(s.charAt(start) + "")) {
                start++;
            }
            
            while(start < end && !vowels.contains(s.charAt(end) + "")) {
                end--;
            }
            
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
        
        return new String(chars);
    }
}