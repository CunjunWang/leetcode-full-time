class Solution1 {
    /*
     * Using XOR.
     * 
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    public int singleNumber(int[] nums) {
        int res = nums[0];
        for (int i = 1; i < nums.length; i++)
            res = res ^ nums[i];
        return res;
    }
}