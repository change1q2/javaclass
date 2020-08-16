package 基础语法;

public class AriTest {
    public static void main(String[] args){
        //(前)++ 先自增1，再运算
        int a1 = 10;
        int b1 =++a1;//a1先自增1（10+1=11），再进行运算将11赋值给b1，所以b1=11
        System.out.println("a1 = " + a1 + ",b1 = " +b1);//a1 = 11,b1 = 11

        //(后)++ 先运算，后自增1
        int a2 = 10;
        int b2 = a2++;//先进行运算a=10赋值给b2,所以b2=10，再自增1,a2=10+1=11
        System.out.println("a2 = " + a2 + ",b2 = " +b2);//a2 = 11,b2 = 10

        //没有赋值运算时，自增1的写法
        short c = 10;
        c++;
        System.out.println(c);//11
    }
}
