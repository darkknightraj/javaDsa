import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {

    // Method to check if the string of brackets is valid
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        // Traverse each character in the string
        for (char ch : s.toCharArray()) {
            switch (ch) {
                case '(':
                case '{':
                case '[':
                    stack.push(ch);
                    break;
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{') {
                        return false;
                    }
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                    break;
            }
        }
        // If the stack is empty, all brackets were matched
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the string of brackets: ");
        String input = scanner.nextLine();
        
        boolean result = isValid(input);
        
        System.out.println("The string is " + (result ? "valid" : "invalid"));
        
        scanner.close();
    }
}
