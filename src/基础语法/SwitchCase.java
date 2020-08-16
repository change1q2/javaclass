package 基础语法;/*
分支结构之二：switch-case
1.格式
switch(表达式){
case 常量1:
    执行语句1;
//   break;

case 常量2:
    执行语句2;

    ...
default:
    执行语句n
    //break;

}

2.说明：
(1)根据switch表达式中的值，一次匹配各个case中的常量，一旦匹配成功，则进入相应case结构中，调用其执行语句。
当调用完执行语句以后，则仍然据徐向下执行其他case结构中的执行语句，直到遇到break关键字或此switch-case结构的
末尾结束关键字default

(2)switch结构中的变道时，只能是如下6种
byte
short
char
int
枚举类型
String

(3)case 后面只能声明

(4)break关键字，用于跳出条件（可选）

(5)default:相当于 if-else结构中的else。（可选，位置随便）

 */

public class SwitchCase {
    public static void main(String[] args){
        int number = 2;
        switch(number){

            case 0:
                System.out.println("zero");
            case 1:
                System.out.println("one");
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
            default:
                System.out.println("other");

        }
    }
}
