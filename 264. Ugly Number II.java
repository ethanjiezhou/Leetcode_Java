public class Solution {
    public int nthUglyNumber(int n) {
        if(n == 1)
            return 1;

        int index2 = 0;
        int index3 = 0;
        int index5 = 0;
        int factor2 = 2;
        int factor3 = 3;
        int factor5 = 5;

        int[] result = new int[n];
        result[0] = 1;

        for(int i = 1; i < n; i++) {
            int min = Math.min(Math.min(factor2, factor3), factor5);
            result[i] = min;
            if(min == factor2) {
                factor2 = 2 * result[++index2];
            }

            if(min == factor3) {
                factor3 = 3 * result[++index3];
            }

            if(min == factor5) {
                factor5 = 5 * result[++index5];
            }
        }

        return result[n-1];
    }
}