package com.qzw.week8;

/**
 * @ClassName News
 * @Description TODO
 * @Author UnKnW
 * @Date 2020/10/29 10:30
 **/
public class News implements MyComparable {
    private Integer id;
    private String title;
    private String content;
    private String type;
    private Integer readCount;
    public News(Integer id, String title, String content, String type, Integer readCount) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.type = type;
        this.readCount = readCount;
    }
    public News() { }
    @Override
    public int compareTo(Object obj) {
        //把比较对象转化成具体的News类型
        News other = (News) obj;
        return this.readCount - other.readCount;
    }
    @Override
    public String toString() {
        return "News:[id=" + this.id + ",title=" + this.title + ",readCount:" + this.readCount;
    }
}
