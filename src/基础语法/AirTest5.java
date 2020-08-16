package 基础语法;/*
运算符之5：位运算符（了解）
结论：1.位运算操作的都是整型数据
     2.<<:在一定范围内，每向左移1位，相当于 *2
       >>:在一定范围内，每向右移一位，相当于/2
 */

public class AirTest5 {
    public static void main(String[] args){
        int i = 21;
        System.out.println("i << 2 :"+ (i << 2));
    }
}
