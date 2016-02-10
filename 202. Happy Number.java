public class Solution {
    public boolean isHappy(int n) {
        if(n == 0)
            return false;
        if(n == 1)
            return true;

        Set<Integer> set = new HashSet<Integer>();
        set.add(n);
        while(n != 1) {
            n = next(n);
            if(!set.add(n)) {
                break;
            } else {
                set.add(n);
            }
        }

        if(n == 1)
            return true;

        return false;
    }

    private int next(int n) {
        int result = 0;
        while(n >= 10) {
            result += (n % 10) * (n % 10);
            n = n / 10;
        }
        result += n * n;
        return result;
    }
}