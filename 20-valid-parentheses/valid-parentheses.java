class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int size = s.length();
        for (int i = 0; i < size; i++) {
            char x = s.charAt(i);
            if (x == '(' || x == '[' || x == '{') {
                st.push(x);
            }
            else if (!st.isEmpty()) {
                if (x == ')') {
                    char a = st.pop();
                    if (a != '(')
                        return false;
                } else if (x == ']') {
                    char b = st.pop();
                    if (b != '[')
                        return false;
                } else if (x == '}') {
                    char c = st.pop();
                    if (c != '{')
                        return false;
                }
            }
            else return false;
        }
        if (!st.isEmpty())
            return false;
        return true;
    }
}