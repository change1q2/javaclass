package 数组;
/*
P11 136
一.数组的概述
1.数组的理解：数组(Array),是多个相同类型数据按一定顺序排列组合，并使用一个名称命名，并通过编号的方式对这些数据进行统一管理

2.数组相关概念：
>数组名
>元素
>下标或索引
>数组的长度：元素的个数

3.数组的特点:
1)数组是有序排列的
2)数据属于引用数据类型，数组的元素既可以是引用数据类型也可以是基本数据类型
3)创建数组对象会在内存种开辟一整块连续空间
4)数组的长度一旦确定，就不能修改

4.数组的分类:
1)按维数：一维数组，二维数组...
2)按数组元素类型：基本数据类型元素数组，引用数据类型元素数组

5.一维数组的使用
1)一维数组的声明和初始化
2)如何调用数组的指定位置的元素
3)如何获取数组的长度
4)如何遍历数组
5)数组元素的默认初始值
6)数组的内存解析
 */

import java.util.concurrent.SynchronousQueue;

public class ArrayTest {
    public static void main(String[] args){

        //1)一维数组的声明和初始化
        int num;//声明
        num = 10;//初始化
        int id = 1001;//声明+初始化

        int[] ids;//声明

        //1.1)静态初始化:数组的初始化和数组元素的赋值操作同时进行
        ids = new int[]{1001,1002,1003,1004};//初始化和赋值一起

        //1.2)动态初始化：数组的初始化和数组元素的赋值操作分开
        String[] names = new String[5];//初始化

        //赋值
        names[0] = "王铭";
        names[1] = "王何";
        names[2] = "张旭";
        names[3] = "孙屠龙";
        names[4] = "王志宏";
        //总结，数组一旦初始化完成，其长度就确定了
        //如何调用数组的指定位置元素：通过角标的方式调用。
        //数组的角标（或索引）从0开始的，到数组的长度-1结束。

        //3)如何获取数组的长度
        //属性length
        System.out.println(names.length);//5
        System.out.println(ids.length);//

        //4)如何遍历数组
       /* System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println(names[4]); */

        for(int i =0 ;i < names.length;i++){
            System.out.println(names[i]);
        }





    }
}
