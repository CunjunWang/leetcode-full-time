class Solution1 {

    /*
     * Use a hash map.
     * 
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length == 0)
            return null;
        
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (map.containsKey(target - num)) 
                return new int[]{i, map.get(target - num)};
            map.put(num, i);
        }
        return null;
    }

}