package 控制语句.综合知识;
/*
嵌套循环
1.将一个循环结构声明在另一个循环体里面

2.
外层循环：循环结构B
内层循环：循环结构A


步骤：         (1)先写外循环i，循环输出6个性（控制行数）
              (2)再写内循环，是内循环执行4次（控制列数）

 */

public class ForForTest {
    public static void main(String[] args){

        //打印4排6个*
        /*
        步骤： (1)先写外循环i，循环输出6个性（控制行数）
              (2)再写内循环，是内循环执行4次（控制列数）
         */
        //System.out.println("******");
//        for(int j = 1; j <= 4 ;j++){
//            for(int i = 1;i <= 6; i++){
//                System.out.print('*');
//            }
//            System.out.println();
//        }

        /*
        打印    i(行号)   j(*的个数)
        *       1        1
        **      2        2
        ***     3        3
        ****    4        4
        *****   5        5

         */

        for(int i = 1; i <=5; i++){//外循环控制行数
            for(int j = 1; j <= i ; j++ ){//内循环控制列数
                System.out.print("*");

            }
            System.out.println();
        }


    }
}
