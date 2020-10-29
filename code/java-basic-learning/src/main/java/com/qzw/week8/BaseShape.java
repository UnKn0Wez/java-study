package com.qzw.week8;

/**
 * @ClassName BaseShape
 * @Description 形状
 * @Author UnKnW
 * @Date 2020/10/29 8:14
 **/
public abstract class BaseShape {
    private static String name;
    public BaseShape(){
        System.out.println("父类初始化");
    }
    /**
     * 求面积
     * @return double
     */
    public abstract double getArea();

    public void getName(){
        //return "hello";
        System.out.println("This is an abstract class.");
    }
}
