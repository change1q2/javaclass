package 基础语法;

public class VarableTest4 {
    public static void main(String[] args){
        //1.编码情况
        //定义long型在末尾要加上L，这里没加L编译也不会报错是因为默认转化为int型了，如果超过int数字就会报错了
        long l1 =123456;
        System.out.println(l1);

        //编译报错
        //long l2 = 312321321423521;

        //加上L后编译正确
        long l2 = 31232132142352145L;

        //编译失败
        //float f1 =12.3;

        //方式1：直接在浮点型后面加上f
        float f2 = 12.3f;
        //方式2：加上强制转换后编译正确
        float f1 = (float)12.3;

        //2.编码情况2：
        //整型常量，默认类型为int型
        //浮点型常量，默认类型为double型
        byte b =12;
        //byte b1 = b +1;//编译失败，整型常量（这里是1），默认类型为int型所以不能用byte接受
        //float f1 = b + 12.3;//编译失败，浮点型常量（这是是12.3），默认类型为double型，不能用float接受
    }
}
