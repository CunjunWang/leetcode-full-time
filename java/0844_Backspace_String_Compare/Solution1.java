class Solution1 {
    /*
     * Use a stack
     *
     * Time Complexity: O(n), n = max(S.len, T.len)
     * Space Complexity: O(n), n = max(S.len, T.len)
     */
    public boolean backspaceCompare(String S, String T) {
        if (S == null && T == null)
            return true;
        
        if (S.isEmpty() && T.isEmpty())
            return true;
        
        return handleBackspace(S).equals(handleBackspace(T));
    }
    
    private String handleBackspace(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (c == '#')
                if (stack.isEmpty())
                    continue;
                else
                    stack.pop();
            else 
                stack.push(c);
        }
        
        String res = "";
        while (!stack.isEmpty()) 
            res = stack.pop() + res;
        
        return res;
    }
}