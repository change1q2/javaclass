package TEXT.输入;/*
如何从键盘获取不同类型的变量
输入的操作：Scanner

实现步骤：
1.导包
2.Scanner实例化：Scanner scan = new Scanner(System.in)
3.调用Scanner类的相关方法（next(),netxXX()）,来获取指定类型的变量

注意：输入不匹配的类型会报异常 inputMisMatchExcel
 */

import java.util.Scanner;

public class ScannerText {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("请输入你的姓名：");
        String name = scan.next();
        System.out.println(name);

        System.out.println("请输入你的芳龄:");
        int age = scan.nextInt();
        System.out.println(age);

        System.out.println("请输入你的体重：");
        double weight = scan.nextDouble();
        System.out.println(weight);

        System.out.println("你是否向中？（true/false）");
        boolean islove = scan.nextBoolean();
        System.out.println(islove);

        //对于char型的获取，Scanner没有提供相关的方法。只能获取一个字符串String就行了

        System.out.println("请输入你的性别:(男/女)");
        String gender = scan.next();
        System.out.println(gender);

        //非要使用char
        char genderChar = gender.charAt(0);
        System.out.println(genderChar);
    }
}
