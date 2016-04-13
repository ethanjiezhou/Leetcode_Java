public class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] strs = str.split(" ");
        int len = pattern.length();
        if(len != strs.length)
            return false;
        Map<Character, String> map = new HashMap<Character, String>();
        for(int i = 0; i < len; i++) {
            char a = pattern.charAt(i);
            String b = strs[i];
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