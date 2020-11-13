package 面向对象.day9.P18再谈方法.方法的重载.TEST;
/*
P18 00:24
重载的练习题
1.编写程序，定义三个重载方法并调用，方法名未mOL
    >三个方法分别接受一个int参数，两个int参数,一个字符串参数。分别执行平方运算并输出结果，相乘并输出结果，输出字符串信息
    >在主类的main()方法中分别用参数区别调用三个方法

2.定义三个重载方法max(),第一个方法求两个int中的最大值，第二个方法求两个double值中的最大值，第三个方法求三个double值中的最大值，并分别调用三个方法。

 */
public class OverLoadText {
    //1.方法的重载
    public void mOL(int i){
        //平方运算
        i = i*i;
        System.out.println(i);

    }
    public void mOL(int i, int j){

        //相乘运算

        System.out.println(i*j);

    }
    public void mOL(String i){
        //输出字符串信息
        System.out.println(i);

    }

    //2.三个重载方法max()
    public void max(int i,int j){
        if (i > j ) {
            System.out.println(i);
        }else{
            System.out.println(j);
        }
    }
    public void max(double i,double j){
        if (i > j ) {
            System.out.println(i);
        }else{
            System.out.println(j);
        }

    }
    public void max(double i,double j,double k){
        if (i > j || j > k ) {
            System.out.println(i);
        }else if(k > i || k > j ){
            System.out.println(k);
        }else{
            System.out.println(j);
        }

    }

  //老师的方法，三元运算符
    public int max2(int i , int j){
        return (i > j)? i : j;
    }

    public double max2(double d1 , double d2){
        return (d1 > d2)? d1 : d2;
    }

    public double max2(double d1 , double d2 , double d3){
        double max = (d1 > d2)? d1 :d2;
        return (max > d3)? max : d3;
    }

}
