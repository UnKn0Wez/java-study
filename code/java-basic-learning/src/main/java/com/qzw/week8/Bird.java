package com.qzw.week8;

/**
 * @ClassName Bird
 * @Description TODO
 * @Author UnKnW
 * @Date 2020/10/29 10:20
 **/
public class Bird implements Fly {
    @Override
    public void fly(String name,int speed){
        System.out.println(Fly.NAME+","+Fly.SPEED);
        System.out.println(name+"飞行，时速"+speed);
    }
    public void test(){
        System.out.println(Fly.NAME);
    }
}
