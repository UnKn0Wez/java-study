package com.qzw.oop.week6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName TestBook
 * @Description 测试
 * @Author UnKnW
 * @Date 2020/10/15
 **/
public class TestBook {
    public static void main(String[] args) {
        Student student = Student.builder()
                .studentName("sb")
                .id("2002922211")
                .gender("male")
                .phone(Phone.builder().brand("iPhone12").price(12000).build())
                .build();
        Book[] books = new Book[]{
                Book.builder().bookName("JavaScript").price(1).build(),
                Book.builder().bookName("Java").price(14).build(),
                Book.builder().bookName("JavaWeb").price(14).build(),
        };
        List<Book> bookList = new ArrayList<>(Arrays.asList(books));
        student.setBook(bookList);
        for(Book book : student.getBook()){
            System.out.println(book.getBookName());
        }
//        student.setBooks(books);
//        System.out.println(student);
//        Book[] books1 = student.getBooks();
//        for (Book book:books1)
//        {
//            System.out.println(book.getBookName());
//        }
    }
}
