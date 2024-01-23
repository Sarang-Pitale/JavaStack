package com.sample;

import java.util.Stack;

public class Demo {
    public static void main(String[] args) {

        Stack<Book> books = new Stack<>();
        for (int i = 0; i < 10; i++) {
            books.push(new Book("Book" + i)); //PUSH elements
        }

        System.out.println(books);
        books.peek().read(); // Give Top Element
        books.pop(); // remove top element
        books.peek().read();
        System.out.println("************* Lambda Expression");
        books.forEach(element->{
            element.read();
        });
        System.out.println("************* Enhanced For Loop");
        for(Book book:books){
            book.read();
        }

    }
}
