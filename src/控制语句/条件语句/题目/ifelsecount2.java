package 控制语句.条件语句.题目;
//题目：编辑程序，声明2个double变量并赋值，判断第一个数大于10.0,且第二个数小于20.0，打印两束之和，否者打印两数之积
public class ifelsecount2 {
    public static void main(String[] args){
        double a =10.0;
        double b = 12.5;
        if(a > 10.0 || b < 20){
            System.out.println(a+b);
        }
        else {
            System.out.print(a*b);
        }

    }
}
