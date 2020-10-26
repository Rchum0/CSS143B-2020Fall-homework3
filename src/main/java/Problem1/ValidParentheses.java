package Problem1;

import java.util.HashMap;
import java.util.Map;

public class ValidParentheses {

    // Do not change signature (function name, parameters, return type)
    public static boolean isValid(String str) {
        // homework
        Map<Character,Character> parenthesesMap = new HashMap<>();
        parenthesesMap.put('(',')');
        parenthesesMap.put('{', '}');
        parenthesesMap.put('[', ']');

        ArrayStack parentheses = new ArrayStack(str.length());
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(parenthesesMap.containsKey(c)){
                parentheses.push(c);
            }else {
                if(parentheses.size() == 0){
                    return false;
                }
                char target = (char)parentheses.peek();
                parentheses.pop();
                if(!parenthesesMap.containsKey(target) || parenthesesMap.get(target) != c){
                    return false;
                }
            }
        }
        if(parentheses.size() > 0){
            return false;
        }
        return true; // place holder
    }
}
