public class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() == 0 && t.length() == 0)
            return true;
        if(s == null && t == null)
            return true;

        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        String s2 = String.valueOf(s1);
        String t2 = String.valueOf(t1);

        if(s2.equals(t2))
            return true;

        return false;
    }
}