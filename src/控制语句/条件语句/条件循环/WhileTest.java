package 控制语句.条件语句.条件循环;
/*
一·循环结构的4个要素
（1）初始化条件
（2）循环条件 ----》是boolean类型
（3）循环体
（4）迭代条件

二.while循环的结构
1
while(2){
    3;
    4
    }
说明：
1.while循环千万小心不要丢了迭代条件，一旦丢了，就可能导致死循环
2.写程序要避免死循环
3.while和for可以相互转换
4.区别：for和while循环初始化条件的作用范围不同。

算法：
有限性
 */

public class WhileTest {
    public static void main(String[] args){
        //遍历100以内所有的偶数
        int i = 1;
        while(i <= 100){
            if(i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }
        System.out.println(i);//100?101?

    }


}
