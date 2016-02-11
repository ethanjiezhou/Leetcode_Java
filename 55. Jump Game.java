//version 1
public class Solution {
    public boolean canJump(int[] nums) {
        int last = nums.length - 1;
        for(int i = nums.length - 2; i >= 0; i--) {
            if(i + nums[i] >= last)
                last = i;
        }
        return last <= 0;
    }
}

//version 2
public class Solution {
    public boolean canJump(int[] A) {
    int max = 0;
    for(int i=0;i<A.length;i++){
        if(i>max) {return false;}
            max = Math.max(A[i]+i,max);
    }
        return true;
    }
}

//version 3
public class Solution {
    public boolean canJump(int[] nums) {
        int currentMaxIndex = 0;
        int index = 0;
        for(; index < nums.length; index++) {
            if(index > currentMaxIndex)
                break;

            currentMaxIndex = Math.max(currentMaxIndex, index + nums[index]);
        }
        if(index - 1 == nums.length - 1)
            return true;

        return false;
    }
}
