class Solution1 {
    public int maxSubArray(int[] nums) {

        /*
         * Dynamic Programming
         *
         * Time Complexity: O(n)
         * Space Complexity: O(1)
         */
        if (nums == null || nums.length == 0)
            return 0;
              
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] > 0) 
                nums[i] += nums[i-1];
            max = Math.max(max, nums[i]);
        }
        
        return max;
    }
}