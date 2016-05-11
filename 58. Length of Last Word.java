public class Solution {
    public int lengthOfLastWord(String s) {
        return s.trim().length()-s.trim().lastIndexOf(" ")-1;
    }
}

/*
public class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int length = s.length();
        if(length == 0)
            return 0;
        
        String[] words = s.split(" +");
        length = words.length;
        return words[length - 1].length();
    }
}
*/