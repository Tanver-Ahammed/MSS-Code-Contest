package com.tanver.Competitive.ostad.app.string;

import java.util.Stack;

public class BracketValidation {

    private boolean isValidateBracket(String brackets) {
        Stack<Character> stackBracket = new Stack<>();
        for (char ch : brackets.toCharArray()) {
            if (ch == '(')
                stackBracket.push(')');
            else if (ch == '{')
                stackBracket.push('}');
            else if (ch == '[')
                stackBracket.push(']');
            else if (stackBracket.isEmpty() || stackBracket.pop() != ch)
                return false;
        }
        return stackBracket.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(new BracketValidation().isValidateBracket("{}{}[]()()(){[()]}"));
    }

}
