class Solution1 {
    /*
     * Sort the input list
     *
     * Time Complexity: O(nlogn)
     * Space Complexity: O(k)
     */
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        if (arr == null || arr.length == 0)
            return new ArrayList<>();
        
        List<Integer> arrList = new ArrayList<>();
        for (int e : arr)
            arrList.add(e);
                
        Collections.sort(arrList, (a,b) -> a == b ? a - b : Math.abs(a-x) - Math.abs(b-x));
        
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < k; i++) 
            res.add(arrList.get(i));
        
        Collections.sort(res);
        return res;
    }
}