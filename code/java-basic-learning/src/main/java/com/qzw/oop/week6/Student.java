package com.qzw.oop.week6;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @ClassName Student
 * @Description 学生
 * @Author UnKnW
 * @Date 2020/10/15
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {
    private String id;
    private String studentName;
    private String gender;
    private Phone phone;
    private List<Book> book;
//    private Book[] books;
}
