class Solution {
    public boolean isValid(String s) {
        Stack stack = new Stack();
        boolean isValid;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '}' || s.charAt(i) == ']' || s.charAt(i) == ')') {
                
                if (stack.empty()) {
                    return false;
                }

                char c = (Character) stack.peek();
                if (s.charAt(i) == '}') {
                    if (c == '{') {
                        stack.pop();
                        continue;
                    } else {
                        return false;
                    }
                } else if (s.charAt(i) == ']') {
                    if (c == '[') {
                        stack.pop();
                        continue;
                    } else {
                        return false;
                    }
                } else if (s.charAt(i) == ')') {
                    if (c == '(') {
                        stack.pop();
                        continue;
                    } else {
                        return false;
                    }
                }
            } else {
                stack.push(s.charAt(i));
            }
        }
        return stack.empty();
    }
}
