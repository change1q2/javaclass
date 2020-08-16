package TEXT;

import java.util.Scanner;

/*
java考试
成绩》100，奖励BMW
成绩为（80，99】 ,奖励iphoneXS
成绩为【60，80】，奖励ipad
其他 无奖励
请从键盘输入(scanner)成绩并判断
 */
public class ScoreText {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入你的成绩：");
        double score = scan.nextDouble();
        System.out.println(score);
        if(score >= 100 ){
            System.out.println("奖励你一辆BMW");
        }else if(score >80  ){}
    }
}
