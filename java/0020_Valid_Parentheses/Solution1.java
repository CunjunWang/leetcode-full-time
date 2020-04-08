class Solution1 {
    /*
     * Use a stack.
     *
     * Time Complexity: O(n)
     * Space Complexity: O(n) in the worst case
     */
    public boolean isValid(String s) {
        if (s == null || s.length() == 0)
            return true;
        
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty())
                    return false;
                
                char top = stack.peek();
                if (c == ')')
                    if (top == '(')
                        stack.pop();
                    else
                        return false;
                else if (c == ']')
                    if (top == '[')
                        stack.pop();
                    else
                        return false;
                else 
                    if (top == '{')
                        stack.pop();
                    else
                        return false;
            } else {
                return false;
            }
        }
        
        return stack.isEmpty();
    }
}