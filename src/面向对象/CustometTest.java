package 面向对象;
/*
方法的使用：

方法：描述类应该具有的功能
比如：Math类: sqrt()\random()
    Scanner类： nextXxx()
    Arrays类： sort() \ binarySearch()\toString()\equals()

1.举例：
public void eat(){}
public void sleep(int hour){}
public String getName(){}
public String getNation(String nation){}

2.方法的声明： 权限修饰符 返回值类型 方法名(形参列表){
            方法体
            }

3.说明：
    3.1关于权限修饰符：
            Java规定的4种权限修饰符：private、public、省缺、protected --
    3.2返回值类型： 有返回值 vs 没有返回值
            3.2.1如果方法有返回值，则必须在方法声明时，置顶返回类型。同时，方法中，需要使用
                  return关键字来返回指定类型的变量或常量。

                  如果方法没有返回值，则方法声明时，使用void来表示，没有返回值的方法中一般不使用
                  return,如果要使用return则直接return;


            3.2.2我们定义方法该不该有返回值？
                    1）题目要求
                    2）凭经验：具体问题具体分析

    3.3方法名：属于标识符，遵循标识符的规则和规范，“见名知意”
    3.4形参列表：方法可以声明0个，1个，或多个形参。
           3.4.1格式：数据类型1 形参1，数据类型2 形参2，...
           3.4.2我们定义方法时，该不该定义形参?
                1)题目要求
                2）凭经验：具体问题具体分析

    3.5方法体：方法功能的提现。




4.return关键字的使用：
        1.使用范围：使用在方法体中
        2.作用：
            1）结束方法
            2）针对于有返回值类型的方法，使用“return  数据" 方法

        3.注意点:
            1）return关键字后面不可以声明执行语句
            2）方法中不可以定义方法

5.方法的使用
    可以调用当前类的属性或方法
            特殊的：方法A中又调用了方法A：递归方法

 */

public class CustometTest {
    public static void main(String[] args){

        Customer cust1 = new Customer();
        cust1.eat();
    }
}

class Customer{
    String name;
    int age;
    boolean isMale;

    //方法的使用
    public void eat(){
        System.out.println("客户吃饭");
    }
    public void sleep(int hour){
        System.out.println("休息了" + hour + "小时");
    }

    public String getName(){
        return name;
    }

    public String getNation(String nation){
        String info = "我的国际是：" + nation;
        return info;
    }





}
