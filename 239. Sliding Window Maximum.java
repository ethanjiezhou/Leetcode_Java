public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums == null || k <= 0)
            return new int[0];

        Deque<Integer> deque = new ArrayDeque<Integer>();
        int n = nums.length;
        int[] r = new int[n - k + 1];
        int ri = 0;

        for(int i = 0; i < n; i ++) {
            while(!deque.isEmpty() && deque.peek() < i-k+1) {
                deque.poll();
            }

            while(!deque.isEmpty() && nums[i] > nums[deque.peekLast()]) {
                deque.pollLast();
            }

            deque.offer(i);
            if(i >= k - 1)
                r[ri++] = nums[deque.peek()];

        }

        return r;
    }
}