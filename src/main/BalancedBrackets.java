package main;


import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

    public static boolean isBalanced(String expression) {
        char[] chars = expression.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : chars){
            if(isOpening(c)){
                stack.push(c);
                break;
            } else
                switch (c){
                    case ')':
                        if(stack.isEmpty() || stack.peek() != '('){
                            return false;
                        }
                        stack.pop();
                        break;
                    case ']':
                        if(stack.isEmpty() || stack.peek() != '['){
                            return false;
                        }
                        stack.pop();
                        break;
                    case '}':
                        if(stack.isEmpty() || stack.peek() != '{'){
                            return false;
                        }
                        stack.pop();
                        break;
                }

        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }

    private static boolean isClosing(char c){
        return c == ')' || c == ']' || c == '}';
    }
    private static boolean isOpening(char c){
        return c == '(' || c == '[' || c == '{';
    }
}
