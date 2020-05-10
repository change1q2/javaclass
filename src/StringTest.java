/*
String类型变量的使用：
1.String属于引用数据类型，翻译为：字符串
2.声明String类型变量时，使用一对""
3.String可以和8中基本数据类型进行运算，且运算只能是连接运算:+
4.运算结果任然是String类型
 */

public class StringTest {
    public static void main(String[] args){
        String s1 = "HELLO";
        System.out.println(s1);

        //char c = '';//编译不通过

        System.out.println("********************************");
        int number = 1001;
        String numberStr = "学号:";
        String info = numberStr + number;// +:连接运算
        System.out.println(info);//学号:1001

        System.out.println("********************************");
        boolean b1 = true;
        String info1 = info + b1;//+:连接运算
        System.out.println(info1);//学号:1001true

        //练习1(只要跟Str在一起的+表示连接)
        System.out.println("********************************");
        char c ='a';//a:97  A:65 //char对应ASCLL码跟她一起会做加法运算
        int num = 10;
        String str = "hello";
        System.out.println(c + num + str);//107hello
        System.out.println(c + str + num);//ahello10
        System.out.println(c + (num + str));//a10hello
        System.out.println((c + num) + str);//107hello
    }
}
