class Solution1 {

    /*
     * Linear Inspace Solution.
     * Two pass.
     *
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     *
     */
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length <= 1)
            return;
        
        int lastNonZero = 0;
        for (int i = 0; i < nums.length; i++) 
            if (nums[i] != 0)
                nums[lastNonZero++] = nums[i];
        
        for (int i = lastNonZero; i < nums.length; i++)
            nums[i] = 0;
    }
}