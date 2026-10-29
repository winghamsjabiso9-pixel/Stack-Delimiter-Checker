/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package delimiterchecker.java;

/* Description: Checks delimiter matching and displays full operation trace
Programmed by: Wing Hams J. Abiso
Last Modified: 2026-10-29
Version: 2.0
Acknowledgements:
*/

import java.util.Scanner;
import java.util.Stack;

public class DelimiterChecker2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Stack: ");
        String input = scanner.nextLine();
        
        Stack<Character> stack = new Stack<>();
        boolean isValid = true;
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
                System.out.println("Read: " + ch);
                System.out.println("Operation: PUSH " + ch);
                System.out.println("Stack: [" + String.join(", ", stack.toString().replace("[", "").replace("]", "").split("\\s*,\\s*")) + "]");
                System.out.println();
            }
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    System.out.println("Read: " + ch);
                    System.out.println("Reason: mismatched delimiter — no opening symbol found");
                    isValid = false;
                } else {
                    char top = stack.peek();
                    System.out.println("Read: " + ch);
                    System.out.println("PEEK: " + top);
                    
                    if (isMatch(top, ch)) {
                        stack.pop();
                        System.out.println("POP: " + top);
                        System.out.println("Stack: [" + String.join(", ", stack.toString().replace("[", "").replace("]", "").split("\\s*,\\s*")) + "]");
                    } else {
                        System.out.println("Reason: mismatched delimiters (" + top + ") does not match [" + ch + "]");
                        isValid = false;
                    }
                }
                System.out.println();
            }
        }
        
        if (isValid && stack.isEmpty()) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
        
        scanner.close();
    }
    
    private static boolean isMatch(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }
}