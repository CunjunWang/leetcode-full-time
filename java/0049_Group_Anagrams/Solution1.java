class Solution1 {

    /*
     * Sort every string, and put the anagram in a map
     *
     * Time Complexity: O(nklog(k)), n = size of strs, k = max size of string
     * Space Complexity: O(n) in the worst case.
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0)
            return new ArrayList<>();
        
        Map<String, List<String>> record = new HashMap<>();
        
        for (String str : strs) {
            char[] strArr = str.toCharArray();
            Arrays.sort(strArr);
            String key = new String(strArr);
            if (record.get(key) == null)
                record.put(key, new ArrayList<>());
            
            record.get(key).add(str);
        }
        
        List<List<String>> result = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry: record.entrySet()) 
            result.add(entry.getValue());
        
        return result;
    }
}