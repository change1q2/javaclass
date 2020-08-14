package 条件循环;

/*
分支结构:if -else(条件判断结构)

一.三种结构

第一种：
if(条件表达式){
}

第二种：二选一
if(条件表达式){
    执行表达式1
}

第三种：多选一
if(条件表达式1){
    执行表达式1
}else if(条件表达式2){
    执行表达式2
}else if(条件表表达式3){
    执行表达式是3
}...
else
 */
public class ifelse {
    public static void main(String[] args){
        //举例单选
        int hearBeats = 102;
        if(hearBeats < 60 || hearBeats >100){
            System.out.println("需要进一步检查");
        }
        System.out.println("检查结束");


        //举例2，二选一
        int age = 23;
        if(age < 18){
            System.out.println("你可以看动画片");
        }else {
            System.out.println("你可以看成人电影");
        }

        //举例3：多选一
        if(age < 0 ){
            System.out.println("输入的数据非法");
        }else if(age < 18){
            System.out.println("处于青少年时期");
        }else{
            System.out.print("处于成人时期");
        }


    }
}
