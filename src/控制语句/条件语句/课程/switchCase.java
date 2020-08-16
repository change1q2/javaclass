package 控制语句.条件语句.课程;
/*
分支结构之二：switch-case

1.格式
switch(表达式){
case 常量1：
    执行语句1；
    //break；
case 常量2：
    执行语句2；

...
default:
    执行语句n;
    //break;
}

2.说明：
(1)根据switch表达式中的值，一次匹配各个case中的常量，一旦匹配成功，则进入相应case结构中，调用其执行语句。
    当调用完执行语句以后，则仍然据需向下执行其他case结构中的执行语句，直到遇到break关键字或者switch-case结构
    末尾结束（default）为止。
(2)break关键字是可选的（可加或者不加都行，一般情况下都加上），可以使用在switch-case结构中，表示一旦执行到此关键字就跳出switch-case结构
(3)switch结构中的表达式，只能是如下6中数据类型之一：byte,short,char,int,枚举类型(),String类型
(4)case之后只能放歌常量，去逐一匹配，不能放范围。、
(5)default:相当于if-else结构中的else,
           default是可选的，并且位置灵活，一般放最后
 */

public class switchCase {
    public static void main(String[] args){
        int number = 2;
        switch(number){
            case 0:
                System.out.println("zero");
            case 1:
                System.out.println("one");
            case 2:
                System.out.println("two");
               // break;
            case 3:
                System.out.println("three");
            default:
                System.out.println("other");
        }
    }
}
