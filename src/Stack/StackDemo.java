package Stack;
import java.util.NoSuchElementException;

public class StackDemo {
    public static void main (String[] args) {
        Stack stack = new Stack();
        stack.push("Item1");
        stack.push("Item2");
        stack.push("Item3");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

    }

}
