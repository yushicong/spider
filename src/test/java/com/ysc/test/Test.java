package com.ysc.test;

/**
 * Created by bjyushicong on 2017/2/23.
 */
public class Test {
    public static void main(String[] args) {
        //int 运算超出临界值
        int i = -2147483648;
        int j = 1;
        if (j-i > 0) {
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        if (j > i) {
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        //Long 正负范围的补码不对称
        Long a = -9223372036854775808L;
        Long b = -1L;
        if (-a > -b) {
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        if (a < b) {
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}
