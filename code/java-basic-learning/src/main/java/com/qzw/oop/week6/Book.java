package com.qzw.oop.week6;

import lombok.*;

/**
 * @ClassName Book
 * @Description 图书实体类
 * @Author UnKnW
 * @Date 2020/10/15
 **/
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Book {

        private String bookName;
        private Integer price;
        private String publishDate;

//        @Override
//        public String toString() {
//                DateFormat sdf = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
//
//                String now = sdf.format(this.publishDate);
//                String s1 = "book{name:%s,date:%s";
//                return String.format(s1,this.bookName,this.price,now);
//                //return "book{name:"+this.bookName+",price:"+this.price+",publishDate:"+now;
//        }
        //    public Book(String bookName,Integer price,Date publishDate)
//    {
//        this.bookName = bookName;
//        this.price = price;
//        this.publishDate = publishDate;
//    }
//    public Book()
//    {
//
//    }
//
//    public String getBookName() {
//        return bookName;
//    }
//
//    public void setBookName(String bookName) {
//        this.bookName = bookName;
//    }
//
//    public Integer getPrice() {
//        return price;
//    }
//
//    public void setPrice(Integer price) {
//        this.price = price;
//    }
//
//    public Date getPublishDate(Date date) {
//        return publishDate;
//    }
//
//    public void setPublishDate(Date publishDate) {
//        this.publishDate = publishDate;
//    }
//
//    @Override
//    public String toString() {
//        //return "《"+this.bookName+"》";
//        StringBuffer stringBuffer = new StringBuffer();
//        stringBuffer.append("《");
//        stringBuffer.append(this.bookName);
//        stringBuffer.append("》");
//        return stringBuffer.toString();
//    }
}
