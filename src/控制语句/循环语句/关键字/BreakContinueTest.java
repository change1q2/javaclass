package 控制语句.循环语句.关键字;
/*
break和continue关键字的使用

break:  switch-case
        循环结构
        结束当前循环

continue: 循环结构
        结束当次循环
 */

public class BreakContinueTest {
    public static void main(String[] args){

        //break跳出当前循环
        for(int i = 1; i<= 10; i++){
            if(i % 4 == 0){
                break;
            }
            System.out.println(i);
        }

        //结束当次循环
        System.out.println("========结束档次循环========");
        for(int i = 1; i <= 10; i++){
            if(i % 4 == 0){
                continue;
            }
            System.out.println(i);
        }

        //结束指定标签的循环
        label:for(int i = 1; i <= 4;i++){
            for(int j = 1;j <= 10;j++){
                if(j % 4 == 0){
                    //break;//默认跳出包裹关键字最近的一层循环
                    //continue
                    //break label;//结束指定标签的循环
                    continue label;
                }
                System.out.print(j);
            }
        }
    }
}
