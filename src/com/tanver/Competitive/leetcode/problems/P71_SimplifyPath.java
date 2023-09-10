package com.tanver.Competitive.leetcode.problems;

import java.util.Stack;

public class P71_SimplifyPath {

    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (char ch : path.toCharArray()) {
            if (ch == '/') {
                if (sb.toString().equals("..")) {
                    if (!stack.isEmpty())
                        stack.pop();
                } else if (!sb.toString().equals(".") && !sb.isEmpty())
                    stack.push(sb.toString());
                sb.setLength(0);
            } else
                sb.append(ch);
        }
        if (sb.toString().equals("..")) {
            if (!stack.isEmpty())
                stack.pop();
        } else if (!sb.toString().equals("/") && !sb.isEmpty() && !sb.toString().equals("."))
            stack.push(sb.toString());
        sb.setLength(0);
        sb.append("/");
        for (int i = 0; i < stack.size(); i++) {
            if (i != stack.size() - 1)
                sb.append(stack.get(i)).append("/");
            else
                sb.append(stack.get(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new P71_SimplifyPath().simplifyPath("/../jkj/"));
        System.out.println(new P71_SimplifyPath().simplifyPath("/home//foo/"));
        System.out.println(new P71_SimplifyPath().simplifyPath("/home/../jhnioj/foo/.."));
        System.out.println(new P71_SimplifyPath().simplifyPath("/..."));
        System.out.println(new P71_SimplifyPath().simplifyPath("/.../../okj"));
        System.out.println(new P71_SimplifyPath().simplifyPath("/."));
    }

}
