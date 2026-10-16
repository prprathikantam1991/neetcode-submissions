class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int eval = 0;
        if (tokens.length == 1) {
            eval = Integer.parseInt(tokens[0]);
        } else {
            for (int i = 0; i < tokens.length; i++) {
                if (tokens[i].equals( "+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")) {
                    int a = stack.pop();
                    int b = stack.pop();
                    int c = 0;
                    switch(tokens[i]) {
                        case "+":
                            c = b + a;
                            eval = c;
                            stack.push(c);
                            continue;
                        case "-":
                            c = b - a;
                            eval = c;
                            stack.push(c);
                            continue;
                        case "*":
                            c = b * a;
                            eval = c;
                            stack.push(c);
                            continue;
                        case "/":
                            c = b / a;
                            eval = c;
                            stack.push(c);
                            continue;
                        default:
                            throw new UnsupportedOperationException();
                    }
                } else {
                    stack.push(Integer.parseInt(tokens[i]));
                }
            }
        }
        return eval;
    }
}
