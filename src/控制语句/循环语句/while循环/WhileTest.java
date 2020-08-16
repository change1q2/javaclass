package 控制语句.循环语句.while循环;
/*
循环4要素：
1.初始化条件
2.循环条件
3.循环体
4.迭代条件

while循环结构
1
while(2){
    3;
    4;
    }
说明：
(1)写while 千万不要丢了4(迭代条件)，否者容易出现死循环
(2)for循环是可以和while循环相互转换的
while与for的不同点：作用域不同
主要在1，for循环的1（初始化条件）在里面只能作用于里面，外面无法使用
        while循环的1（初始化条件）在外面，作用域外部，可以在外部使用
 */
//执行顺序 1-2-3-4-2-3-4-...-2

//遍历100以内的所有偶数
public class WhileTest {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) {
            if(i % 2 == 0){
                System.out.println(i);
            }
            i++;

        }
    }
}
