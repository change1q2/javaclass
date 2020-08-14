package 条件循环;
/*
一·循环结构的4个要素
（1）初始化条件
（2）循环条件 ----》是boolean类型
（3）循环体
（4）迭代条件

二.do-while循环的结构(至少会执行一次循环体)
1 初始化条件
do{
    3;   循环体
    4；
    }while(2);

执行过程：1-3-4-2

 */
public class DoWhileTest {
    public static void main(String[] args){

        //遍历100以内的偶数,计算所有偶数的和和个数
        int num = 1;
        int sum = 0;//记录求和总数
        int count = 0; //记录个数
        do{
            if(num % 2 == 0){
                System.out.println(num);
                sum += num;
                count++;
            }
            num++;
        }while(num <= 100);
        System.out.println("总和为：" + sum);
        System.out.println("个数为:" + count);
    }
}
