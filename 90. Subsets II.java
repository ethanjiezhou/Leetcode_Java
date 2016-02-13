public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
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
                    if(!list.contains(temp))
                        list.add(temp);
                }
                List<Integer> check = new ArrayList(Arrays.asList(value));
                if(!list.contains(check))
                    list.add(check);
            }
        }

        list.add(new ArrayList<Integer>());
        return list;
    }
}
