package org.example.java8.streamAPI;

import java.util.stream.Stream;

public class PeekMethod {
    public static void main(String[] args) {
        Stream<String> froots = Stream.of("mango","apple","banana","pineApple","chiku");
        //froots.peek(System.out::println).forEach(s->{});
        //System.out.println();

        froots.peek(e->System.out.println("Original: "+e))
                .map(s -> s.toUpperCase())
                .peek(s->System.out.println("Upper Case: "+s))
                .filter(a->a.startsWith("A"))
                .peek(a->System.out.println("Start with A: "+a))
                .forEach(a->{});
    }
}
