package Arrays.Two_Pointers.ValidParenthesis;
import java.util.*;
public class ValidParenthesis {
    public static Boolean isValidParenthesis(String str){
        Stack<Character> st = new Stack<>();
        for(int i=0;i<str.length();i++){
            char cur = str.charAt(i);
            if(cur == '(' || cur == '{' || cur == '['){
                st.push(cur);
            }else{
                char stp = st.peek();
                if(cur == ')' && stp == '(') st.pop();
                else if(cur == ']' && stp == '[') st.pop();
                else if (cur == '}' && stp == '{') st.pop();
            }
        }
        return st.isEmpty();
    }
    public static void main(String [] args){
        String s = "(()())[]{}";
        Boolean result = isValidParenthesis(s);
        System.out.print(result);
    }
}