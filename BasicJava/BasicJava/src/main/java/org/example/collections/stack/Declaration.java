package org.example.collections.stack;

import java.util.Stack;

public class Declaration {
    public static void main(String[] args) {
        Stack<String> str = new Stack<>();
        str.push("nana");
        str.push("bhau");
        str.push("kalyani");
        str.push("monika");
        str.push("shilpa");
        System.out.println("before pop:" + str);
        str.pop();
        System.out.println("after pop: " + str);
        System.out.println("peek:" + str.peek());
        System.out.println("empty:" + str.empty());
        System.out.println("search" + str.search("shilpa"));
        System.out.println("search" + str.search("monika"));
        System.out.println("search" + str.search("bhau"));
        System.out.println(str.pop());
        System.out.println("peek:" + str.peek());

    }
}