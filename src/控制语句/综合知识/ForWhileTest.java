package 控制语句.综合知识;
/*
P9 -87
从键盘输入不确定的整数，并判断读入的整数和负数个数，输入0的时候结束
分析：一句一句的写
从键盘输入不确定的整数
（1）获得2个信息
        1.导入输入方法Scanner   import java.util.Scanner;
        2.使用输入方法   Scanner scan = new Scanner(System.in);
        3.用scanner方法去读这个整数
（2）加入循环体while，因为没有告诉你循环条件所以可以使用true把循环条件占用着，并使用break跳出这个循环，要不然会死循环因为不知道循环条件

并判断读入的正数和负数个数
(1)使用计数器来记录对应的个数
    int positiveNumber = 0;//记录正数的个数
    int negativeNumber = 0;//记录负数的个数
（2）判断number的正负情况

说明：
1.不在循环条件部分限制次数的结构：for(;;) 或while(true)
2.结束循环有几种方式？
   方式1：循环条件部分返回false
   方式2：在循环体中，执行break
 */
import java.util.Scanner;
class ForWhileTest {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int positiveNumber = 0;//记录正数的个数
        int negativeNumber = 0;//记录负数的个数
        while(true){//for(;;)
            int number =scan.nextInt();

            //判断number的正负情况
            if(number > 0){
                positiveNumber++;
            }else if(number < 0){
                negativeNumber++;
            }else {
                break;
            }
        }
        System.out.println("输入整数的个数：" +  positiveNumber);
        System.out.println("输入负数的个数：" +  negativeNumber);

    }
}
