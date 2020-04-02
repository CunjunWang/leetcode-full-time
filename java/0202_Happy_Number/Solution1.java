class Solution1 {
    /*
     * Using a hash set to store the seen number.
     * If a number is not a happy number,
     * there should a cycle.
     * Similar to Floyd Cycle Detection Algorithm.
     *
     * Time Complexity: O(N);
     * Space Complexity: O(N);
     */
    public boolean isHappy(int n) {
        Set<Integer> record = new HashSet<>();
        while (n != 1) {
            record.add(n);
            String nStr = String.valueOf(n);
            
            int newN = 0;
            for (char c : nStr.toCharArray()) 
                newN += (c - '0') * (c - '0');
            
            if (record.contains(newN))
                return false;
            
            n = newN;
        }
        return true;
    }
}