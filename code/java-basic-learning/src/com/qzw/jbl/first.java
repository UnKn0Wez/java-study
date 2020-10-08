package com.qzw.jbl;

/**
 * @ClassName first
 * @Description 求阶乘
 * @Author UnKnW
 * @Date 2020/10/8
 **/
public class first {
    public static void main(String[] args) {
        System.out.println(getFac(5));
    }
    public static int  getFac(int n)
    {
        int result = 1;
        for (int i=1;i<=n;i++)
        {
            result*=i;
        }
        return result;
    }
}
