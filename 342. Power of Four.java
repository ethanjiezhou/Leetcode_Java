public class Solution {
    public boolean isPowerOfFour(int num) {
        return num > 0 && (num & (num - 1)) == 0 && Integer.numberOfTrailingZeros(num) % 2 == 0;
    }
}

/*
public class Solution {
    public boolean isPowerOfFour(int num) {
        return num > 0 && Integer.bitCount(num) == 1 && Integer.numberOfTrailingZeros(num) % 2 == 0;
    }
}
*/