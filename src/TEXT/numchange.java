package TEXT;

public class numchange {
    public static void main(String[] args){
        //练习：交换两个变量的值
        int num1 = 10;
        int num2 = 20;
        //方式一：定义临时变量
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("num1 = " + num1 + ",num2 = " + num2);


        //方式二：计算法,弊端：数据可能会超出存储范围，有一定局限性
        int num3 = 10;
        int num4 = 20;

        num3 = num3 + num4;
        num4 = num3 - num4;
        num3 = num3 - num4;
        System.out.println("num3 = " + num3 + ",num4 = " + num4);
    }
}
