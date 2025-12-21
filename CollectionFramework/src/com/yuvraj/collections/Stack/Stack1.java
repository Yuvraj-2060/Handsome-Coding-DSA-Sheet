package com.yuvraj.collections.Stack;

import java.util.Iterator;
import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Yuvraj");
        stack.push("Karthik");

//        Iterator itr = stack.iterator();
//
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }
        for (String str: stack)
        {
            System.out.println(str);
        }
    }
}
