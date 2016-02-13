public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        list.add(new ArrayList<Integer>()); // add null list
        Arrays.sort(nums);
        for(int value : nums) {
            int size = list.size();
            for(int i = 0; i < size; i++) {
                List<Integer> temp = new ArrayList<>(list.get(i));
                temp.add(value);
                if(!list.contains(temp))
                    list.add(temp);
            }
        }
        return list;
    }
}
