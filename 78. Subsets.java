public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for(int value : nums) {
            if(list.isEmpty()) {
                list.add(new ArrayList(Arrays.asList(value)));
            } else {
                int size = list.size();
                for(int i = 0; i < size; i++) {
                    List<Integer> temp = new ArrayList<>(list.get(i));
                    temp.add(value);
                    list.add(temp);
                }
                list.add(new ArrayList(Arrays.asList(value)));
            }
        }

        list.add(new ArrayList<Integer>());
        return list;
    }
}