/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package delimiterchecker.java;

/* Description: Checks delimiter matching and displays full operation trace
Programmed by: Wing Hams J. Abiso
Last Modified: 2026-10-29
Version: 1.0
Acknowledgements:
*/

import java.util.Scanner;
import java.util.Stack;

public class DelimiterChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an expression: ");
        String input = scanner.nextLine();
        
        Stack<Character> stack = new Stack<>();
        boolean isValid = true;
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    isValid = false;
                } else {
                    char opened = stack.pop();
                    if (!isMatch(opened, ch)) {
                        isValid = false;
                    }
                }
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