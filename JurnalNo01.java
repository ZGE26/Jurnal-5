import java.util.Stack;

public class JurnalNo01 {
    // Fungsi untuk mengecek apakah karakter adalah operator
    private static boolean isOperator(char c) {
        return (c == '+' || c == '-' || c == '*' || c == '/' || c == '^');
    }

    // Fungsi untuk mengecek precedence operator
    private static int precedence(char operator) {
        switch (operator) {
            case '^':
                return 3;
            case '*':
            case '/':
                return 2;
            case '+':
            case '-':
                return 1;
            default:
                return 0;
        }
    }

    // Fungsi untuk mengubah infix menjadi postfix
    public static String infixToPostfix(String infix) {
        Stack<Character> stack = new Stack<>();
        StringBuilder postfix = new StringBuilder();

        for (char c : infix.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                postfix.append(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                stack.pop(); // Pop '('
            } else {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    postfix.append(stack.pop());
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }

        return postfix.toString();
    }

    public static void main(String[] args) {
        String infixExpression = "a+b*(c^d-e)^(f+g*h)-i";
        String infixExpression2 = "a+b*c";
        System.out.println("Infix: " + infixExpression2);
        String postfixExpression2 = infixToPostfix(infixExpression2);
        System.out.println("Postfix: " + postfixExpression2);
        System.out.println("Infix: " + infixExpression);
        String postfixExpression = infixToPostfix(infixExpression);
        System.out.println("Postfix: " + postfixExpression);

    }
}
