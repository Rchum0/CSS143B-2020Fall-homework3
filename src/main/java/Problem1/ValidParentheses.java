package Problem1;

public class ValidParentheses {

    // Do not change signature (function name, parameters, return type)
    public static boolean isValid(String str) {
        // homework
        LinkedListStack<Character> parStack = new LinkedListStack<>();
        if (str != null) {
            for (int i = 0; i < str.length(); i++) {
                char paren = str.charAt(i);
                if (paren == '(' || paren == '{' || paren == '[')
                    parStack.push(paren);
                else {
                    if (parStack.size() == 0) return false;
                    char pair = parStack.pop();
                    boolean match = false;
                    if (pair == '(')
                        match = (paren == ')');
                    else if (pair == '{')
                        match = (paren == '}');
                    else if (pair == '[')
                        match = (paren == ']');

                    if (!match) return false;
                }
            }
        }
        return parStack.size() == 0;
    }
}
