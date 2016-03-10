public class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        String value = String.valueOf(x);
        int length = value.length();
        for(int i = 0; i < length; i++) {
            if(value.charAt(i) != value.charAt(length - i - 1))
                return false;
        }
        return true;
    }
}