import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");
        System.out.println(stack); // print all stack
        System.out.println("removing value from the top: " + stack.pop()); // remove value from the top of the stack
        System.out.println("current top: " + stack.peek()); // print top of the stack
        System.out.println("is empty? " + stack.empty()); // true if stack is empty
    }
}
