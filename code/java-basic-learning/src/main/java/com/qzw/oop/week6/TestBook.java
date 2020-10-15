package com.qzw.oop.week6;

import java.util.Date;

/**
 * @ClassName TestBook
 * @Description 测试
 * @Author UnKnW
 * @Date 2020/10/15
 **/
public class TestBook {
    public static void main(String[] args) {
        Book book = Book.builder()
                .bookName("java")
                .price(88)
                .publishDate(new Date())
                .build();


        System.out.println(book);
//        Book book = new Book();
//        book.setBookName("Java");
//        book.setPrice(88);
//        book.setPublishDate(new Date());
//        Book book1 = new Book(bookName:"高数" , price:20 , new Date());
//        System.out.println(book1);
    }
}
