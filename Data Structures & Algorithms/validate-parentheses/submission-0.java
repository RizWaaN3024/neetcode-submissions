class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> braceStack = new Stack<Character>();
        char [] charArray = s.toCharArray();
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        for (char c : charArray) {
            if (map.containsKey(c)) {
                if (braceStack.isEmpty() || map.get(c) != braceStack.peek()) {
                    return false;
                }
                braceStack.pop();
            } else {
                braceStack.push(c);
            }
        }
        return braceStack.isEmpty();
    }
}
