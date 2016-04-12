public class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())
            return false;
        Map<Character, Character> map = new HashMap<Character, Character>();
        for(int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);
            if(map.containsKey(a)) {
                if(map.get(a).equals(b)) {
                    continue;
                } else {
                    return false;
                }
            } else {
                if(!map.containsValue(b)) {
                    map.put(a, b);
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
/*
public class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())
            return false;
        Map<Character, Character> left = new HashMap<Character, Character>();
        Map<Character, Character> right = new HashMap<Character, Character>();
        for(int i = 0; i < s.length(); i++) {
            if(left.containsKey(s.charAt(i)) && left.get(s.charAt(i)) != t.charAt(i)) {
                return false;
            } else if(right.containsKey(t.charAt(i)) && right.get(t.charAt(i)) != s.charAt(i)) {
                return false;
            } else {
                left.put(s.charAt(i), t.charAt(i));
                right.put(t.charAt(i), s.charAt(i));
            }
        }
        return true;
    }
}
*/