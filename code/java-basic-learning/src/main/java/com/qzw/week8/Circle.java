package com.qzw.week8;

/**
 * @ClassName Circle
 * @Description 圆形
 * @Author UnKnW
 * @Date 2020/10/29 8:26
 **/
public class Circle extends BaseShape {
    private final Integer r;
    public Circle(Integer r){
        super();//调用父类的构造方法
        System.out.println("子类初始化");
        this.r =r;
    }

    @Override
    public void getName() {
        //super调用父类方法
        super.getName();
        System.out.println("This is a Circle.");
    }

    @Override
    public double getArea() {
        return Math.PI * r * r;
    }
    public void printArea(){
        System.out.println(this.getArea());
    }
}
