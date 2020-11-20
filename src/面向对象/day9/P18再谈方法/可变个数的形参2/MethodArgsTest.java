package 面向对象.day9.P18再谈方法.可变个数的形参2;
/*
可变个数形参的方法：
    1.jdk 5.0新增内容
    2.具体的使用:
        2.1可变个数形参的格式：数据类型 ... 变量名
            public void show(String ... strs){}
        2.2当调用可变个数形参的方法时，传入的参数个数可以使：0个，1个，2个
        2.3可变个数形参的方法与本类中方法名相同，形参不同的方法之间构成重载
        2.4可变个数形参的方法与本类中方法名相同，形参类型页相同的数组之间不构成重载，换句话说(二者之间不能共存)
        2.5可变个数形参在方法的形参中，必须声明在末尾
        2.6可变个数形参方法中，最多只能声明一个可变形参

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

    //错误写法，报错信息：Vararg parameter must be the last in the lis
    //            解读：可变形参必须放在最后，否者编译器无法识别
//    public void show(String... strs, int i) {
//
//    }

    //正确写法
    public void show(int i, String... strs) {

    }
}
