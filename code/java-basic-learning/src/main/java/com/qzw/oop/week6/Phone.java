package com.qzw.oop.week6;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Phone
 * @Description TODO
 * @Author UnKnW
 * @Date 2020/10/15
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Phone {
    private Integer price;
    private String brand;
}
