public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<List<String>>();
        if(strs == null || strs.length == 0)
            return list;

        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        Arrays.sort(strs);
        for(String str : strs) {
            char[] ca = str.toCharArray();
            Arrays.sort(ca);
            String KeyStr = String.valueOf(ca);
            if(!map.containsKey(KeyStr))
                map.put(KeyStr, new ArrayList<String>());
            map.get(KeyStr).add(str);
        }
        return new ArrayList<List<String>>(map.values());
    }
}