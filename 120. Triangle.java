public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle == null || triangle.size() == 0)
            return 0;

        int size = triangle.size();
        int[] array = new int[size+1];

        for(int i = size - 1; i >= 0; i--) {
            for(int j = 0; j < triangle.get(i).size(); j++) {
                array[j] = Math.min(array[j], array[j + 1]) + triangle.get(i).get(j);
            }
        }

        return array[0];
    }
}