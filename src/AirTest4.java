/*
运算符4：逻辑运算符
&逻辑与   &&短路与
|逻辑或   ||短路或
！逻辑非
^逻辑异或
说明：逻辑运算符只适用于boolean类型

 */

public class AirTest4 {
    public static void main(String[] args){
        //区分& 与 &&
        //单&
        System.out.println("********逻辑与&  短路&&**************************");
        boolean b1 = true;
        b1 = false;
        int num1 = 10;
        if(b1 & (num1++ >0)){
            System.out.println("我现在在北京");
        }else {
            System.out.println("我现在在南京");
        }
        System.out.println("num1 = " + num1);
        System.out.println("**********************************");

        //双&&,
        // 1.当符号左边（boolean为true）是true时都进行执行计算
        // 2.当符号左边（boolean为false），短路后不会进行if里面不会进行执行直接绕过去了
        boolean b2 = true;
        b2 = false;
        int num2 = 10;
        if(b2 && (num2++ >0)){
            System.out.println("我现在在北京");
        }else {
            System.out.println("我现在在南京");
        }
        System.out.println("num2 = " + num2);



        System.out.println("**************逻辑或| 与 短路或||********************");

        //区分 |逻辑或   ||短路或
        //相同点： |与||运算那结果相同
        //相同点2：当符号左边是false时两者会执行右边的计算
        //不同点：当符号左边是true时，|继续执行，||不执行
        boolean b3 = true;
        b3 = false;
        int num3 = 10;
        if(b3 | (num2++ >0)){
            System.out.println("我现在在北京");
        }else {
            System.out.println("我现在在南京");
        }
        System.out.println("num3 = " + num3);
        System.out.println("**********************************");



        boolean b4 = true;
        b4 = false;
        int num4 = 10;
        if(b4 | (num2++ >0)){
            System.out.println("我现在在北京");
        }else {
            System.out.println("我现在在南京");
        }
        System.out.println("num4 = " + num4);

    }
}
