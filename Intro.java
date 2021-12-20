package StacksAndQueues;

import java.util.Stack;

public class Intro {
    public static void main(String[] args) {
        // Stacks ---> Last In First Out

        Stack<Integer> st=new Stack<>(); // Creating a Stack

        st.push(10);
        System.out.println(st+ "-->"+st.peek()+"  "+st.size());
        st.push(20);
        System.out.println(st+ "-->"+st.peek()+"  "+st.size());
        st.push(30);
        st.push(40);
        System.out.println(st+ "-->"+st.peek()+"  "+st.size());
        st.pop();
        System.out.println(st+ "-->"+st.peek()+"  "+st.size());
        st.pop();
        System.out.println(st+ "-->"+st.peek()+"  "+st.size());
        st.pop();
        System.out.println(st+ "-->"+st.peek()+"  "+st.size());

    }
}
