import java.util.Stack;

public class Main{
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("1");
        stack.push("2");
        stack.push("3");
        System.out.println("Original stack:");
        System.out.println(stack);

        String top = stack.pop();
        System.out.println("\nRemove top from the stack: " + top);

        System.out.println("\nStack after removing top:");
        System.out.println(stack);

        String currentTop = stack.peek();
        System.out.println("\nCurrent top on the stack: " + currentTop);
    }
}
