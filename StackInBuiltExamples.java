package StacksAndQueues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackInBuiltExamples {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>(); .. Stack is a class
//        stack.push(34);
//        stack.push(24);
//        stack.push(54);
//        stack.push(64);
//        stack.push(94);
//
//        System.out.println(stack.pop());

        Queue<Integer> queue=new LinkedList<>();  // Queue is a Interface
        queue.add(3);
        queue.add(5);
        queue.add(8);
        queue.add(12);

        System.out.println(queue.remove());
        System.out.println(queue.remove());




    }
}
