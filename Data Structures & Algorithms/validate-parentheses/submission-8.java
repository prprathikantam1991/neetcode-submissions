class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> closeToOpen = new HashMap<>();
        closeToOpen.put('}', '{');
        closeToOpen.put(')', '(');
        closeToOpen.put(']', '[');

        Deque<Character> dq = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (closeToOpen.containsKey(c)) {
                if (!dq.isEmpty() && dq.peekFirst() == closeToOpen.get(c)) {
                    dq.pollFirst();
                } else {
                    return false;
                }
            } else {
                dq.addFirst(c);
            }
        }

        return dq.size() == 0;
    }
}
