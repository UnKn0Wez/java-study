package com.qzw.week8;

/**
 * @ClassName SuperStar
 * @Description TODO
 * @Author UnKnW
 * @Date 2020/10/29 10:08
 **/
public class SuperStar implements Filmable, Singable, TVable {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public SuperStar() {
        super();
    }
    public SuperStar(String name) {
        super();
        this.name = name;
    }
    @Override
    public void actFilm() {
        System.out.println(this.name + "会演电影");
    }

    @Override
    public void sing() {
        System.out.println(this.name + "会唱歌");
    }

    @Override
    public void showTV() {
        System.out.println(this.name + "会演电视");
    }
    public void introduce(){
        System.out.println(name + "自我介绍");
    }
}
