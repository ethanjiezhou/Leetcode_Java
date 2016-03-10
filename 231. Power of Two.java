public class Solution {
    public boolean isPowerOfTwo(int n) {
        return n>0 && Integer.bitCount(n) == 1;
    }
}


public class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        return (n&(n-1)) == 0;
    }
}



public class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0)
            return false;
        if(n == 1)
            return true;
        while(n > 1) {
            if(n % 2 != 0)
                return false;
            n = n / 2;
        }
        return true;
    }
}
