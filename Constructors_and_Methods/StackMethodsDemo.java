package Constructors_and_Methods;

import java.util.Stack;

public class StackMethodsDemo {
    public static void main(String[] args) {
        // creating an instance of Stack class
        Stack<Integer> stk = new Stack<>();

        // checking stack is empty or not
        boolean result = stk.empty();
        System.out.println("Is the stack empty? " + result); // 1

        // pushing elements into stack
        stk.push(153); // 2
        stk.push(370);
        stk.push(371);
        stk.push(407);

        // prints elements of the stack
        System.out.println("Elements in Stack: " + stk);
        stk.pop(); // 3
        System.out.println("After POP Elements in Stack: " + stk);
        int top = stk.peek(); // 4
        System.out.println("Top element in stack Is " + top);
        int index = stk.search(370); // 5
        System.out.println("index of 370 is :" + index);
    }
}