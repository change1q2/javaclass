package 控制语句.条件语句.题目;

import java.util.Scanner;

//狗狗5岁相当于人多大？前两年每一年相当于人10.5岁，之后每一年相当于人4岁，那么5岁的狗狗相当于人多少岁？
//编写一个程序，获取用户输入狗狗的年龄，通过程序显示狗狗相当于人的年龄，如果负数显示一个提示
public class ifelse3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("请输入狗狗的年龄：");
        double age = scan.nextInt();
        //System.out.println(age);
        if(age <= 2){
          double  page = age * 10.5;
          System.out.println("狗狗的年龄小于2岁相当于人的"+ page + "岁");
        }
        else if (age >2){
            double page = 2*10.5 + (age-2)*4;
            System.out.println("狗狗的年龄大于2岁相当于人的"+ page + "岁");
        }
    }
}
