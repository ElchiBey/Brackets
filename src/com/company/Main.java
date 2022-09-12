package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String input = sc.next();
            //Complete the code
            Stack<String> stack = new Stack<>();
            String[] brackets = new String[input.length()];
            for (int i = 0; i < input.length(); i++) {
                brackets[i] = String.valueOf(input.charAt(i));
            }

            int index = 0;

            for (int i = 0; i < input.length(); i++) {

                // push opening brackets into the stack
                if (brackets[i].equals("[") ||
                        brackets[i].equals("{") ||
                        brackets[i].equals("(")) {
                    stack.push(brackets[i]);
                    index = i;
                }

                // pop closing brackets from the stack if they match
                else if ((!stack.isEmpty()) &&
                        ((brackets[i].equals("]") && stack.peek().equals("[") ||
                                (brackets[i].equals("}") && stack.peek().equals("{")) ||
                                (brackets[i].equals(")") && stack.peek().equals("("))))) {
                    stack.pop();
                    index = i;
                } else {
                    break;
                }
            }

            System.out.println(stack.isEmpty() && index == input.length() - 1 ? "true" : "false");
            stack.removeAllElements();
        }
        sc.close();
    }
}

