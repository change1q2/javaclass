package 控制语句.循环语句.for循环;
/*
循环结构4个基本要素：
1.初始化条件
2.循环条件---->boolean类型
3.循环体
4.迭代条件

for循环的结构
for(1,2,4){
    3
}
执行过程：1-2-3-4-2-3-4-...-2

 */
//打印500个helloworld
public class DoWhileTest {
    public static void main(String[] args){
        for(int i = 1;i <= 5;i++ ) {
            System.out.println("Hello World!");
            }
        }
}
