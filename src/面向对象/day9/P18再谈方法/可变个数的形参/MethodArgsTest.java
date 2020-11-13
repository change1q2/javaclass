package 面向对象.day9.P18再谈方法.可变个数的形参;
/*
可变个数形参的方法：
    1.jdk 5.0新增内容
    2.具体的使用:
        2.1可变个数形参的格式：数据类型 ... 变量名
            public void show(String ... strs){}
        2.2当调用可变个数形参的方法时，传入的参数个数可以使：0个，1个，2个
        2.3可变个数形参的方法与本类中方法名相同，形参不同的方法之间构成重载

 */


public class MethodArgsTest {

    public static void main(String[] args){
        MethodArgsTest test = new MethodArgsTest();
        test.show(12);
        test.show("hello");
        test.show();

    }

    public void show(int i){

    }

    public void show(String s){
        System.out.println("show(String)");

    }

    //可变个数的形参
    public void show(String ... strs){
        System.out.println("show");

    }
}
