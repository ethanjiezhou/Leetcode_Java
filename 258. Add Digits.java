// version 1
public class Solution {
    public int addDigits(int num) {
        if(num <= 9)
            return num;

        int remain = num % 9;
        if(remain == 0)
            return 9;
        else
            return remain;
    }
}

// version 2
public class Solution {
    public int addDigits(int num) {
        return (num - 1) % 9 + 1;
    }
}
