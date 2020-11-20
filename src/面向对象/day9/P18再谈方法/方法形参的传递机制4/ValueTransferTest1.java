package 面向对象.day9.P18再谈方法.方法形参的传递机制4;
/*
方法形参的传递机制： 值传递
1.形参：方法定义时，声明小括号内的参数
  实参：方法调用时，事迹传递给形参的数据
2.值传递机制：


 */

public class ValueTransferTest1 {
    public static void main(String[] args){

        int m = 10;
        int n = 20;

        System.out.println("m = " + m + ", n = " + n);
        //交换两个变量的值操作
        int temp = m;
        m = n;
    }
}
