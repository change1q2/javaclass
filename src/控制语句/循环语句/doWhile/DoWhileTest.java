package 控制语句.循环语句.doWhile;
/*
循环结构4个基本要素：
1.初始化条件
2.循环条件---->boolean类型
3.循环体
4.迭代条件

do-while结构
1
do{
    3;
    4;
}while(2);

执行过程：1-3-4-2-3-4-2-...2

说明：
1.do-while 循环至少会执行一次循环体！
2.开放中一般使用for和while循环

*/
//遍历100以内的偶数
public class DoWhileTest {
    public static void main(String[] args){
        int num = 1;
        do{
            if(num % 2 == 0 ){
                System.out.println(num);
            }
            num++;
        }while(num <= 100);


    }
}
