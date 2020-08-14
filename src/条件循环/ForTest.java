package 条件循环;/*
For循环结构的使用
一.循环结构的4个要素
(1)初始化条件
(2)循环条件
(3)循环体
(4)迭代条件

二.for循环的结构
for(1;2;3){
    4
}

执行过程: 1-2-3-4-2-3-4-...-2
进度：P8 114
 */

public class ForTest {
    public static void mian(String[] args){
        for(int i =1; i <= 5; i++){
            System.out.println("Hello");
        }

        //练习：
        int num =1 ;
        for(System.out.print('a');num <=3;System.out.print('c'),num++){
            System.out.print('b');
        }

    }

}
