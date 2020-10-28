package com.qzw.week7.homework;

/**
 * @ClassName Point
 * @Description TODO
 * @Author UnKnW
 * @Date 2020/10/22
 **/
public class Point {
    private int x;
    private int y;

    public Point() {
        super();
        System.out.print("point被初始化");
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public double distance(Point b){
        double z = 0;
        if(this.x==this.y){
            return z=Math.abs(this.y-b.y);
        }else if(this.y==b.y){
            return z=Math.abs(this.x-b.x);
        }else{
            z=Math.sqrt(Math.pow(this.x-b.x,2)+Math.pow(this.y-b.y,2));
            return z;
        }
    }
}
