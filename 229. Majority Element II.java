public class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        if(nums == null || nums.length == 0)
            return list;

        int candidate1 = 0;
        int count1 = 0;
        int candidate2 = 0;
        int count2 = 0;

        for(int value : nums) {
            if(candidate1 == value) {
                count1++;
            } else if(candidate2 == value) {
                count2++;
            } else if(count1 == 0) {
                candidate1 = value;
                count1++;
            } else if(count2 == 0) {
                candidate2 = value;
                count2++;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == candidate1)
                count1++;
            else if (nums[i] == candidate2)
                count2++;
        }
        if (count1 > nums.length / 3)
            list.add(candidate1);
        if (count2 > nums.length / 3)
            list.add(candidate2);
        return list;
    }
}