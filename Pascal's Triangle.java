public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(numRows == 0)
            return list;
        list.add(new ArrayList(Arrays.asList(1)));
        for(int i = 1; i < numRows; i++) {
            List<Integer> level = new ArrayList<Integer>();
            for(int j = 0; j <= i; j++) {
                if(j == 0 || j == i) {
                    level.add(1);
                } else {
                    level.add(list.get(i - 1).get(j - 1) + list.get(i - 1).get(j));
                }
            }
            list.add(level);
        }
        return list;
    }
}