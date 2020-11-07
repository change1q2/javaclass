package 面向对象.day9.P17;
/*
一、理解“万事万物皆对象”
  1.在Java语言范畴中，我们都将功能、结构等封装到类中，通过类的实例化，来条用具体的功能结构
        》Scanner,String等
        》文件，File
        》网络资源:URL

  2.涉及到JAVA语言与前端Html、后端的数据库交互时，前后端的结构在JAVA层面交互时，都体现为类、对象

二.内解析说明
    1.引用数据类型，只可能存储两类值，null或者地址值（含变量的类型）

三、匿名对象的使用
    1.理解：我们创建的对象，没有显示的赋值给一个变量名。即为匿名对象的
    2.特征：匿名对象只能调用一次
    3.开发中的使用
 */
public class InstanceTest {
    public static void main(String[] args){
        Phone p = new Phone();
        //p = null;
        System.out.println(p);

        p.sendEmail();
        p.playGame();


        //匿名对象
//        new Phone().sendEmail();
//        new Phone().playGame();

         new Phone().price = 1999;
         new Phone().showPrice();


         //*************************
        PhoneMall mall = new PhoneMall();
        //匿名对象使用
        mall.show(new Phone());

    }
}


class PhoneMall{
    public void show(Phone phone){
        phone.sendEmail();
        phone.playGame();
    }

}

class Phone{
    double price;//价格
    public void sendEmail(){
        System.out.println("发送邮件");
    }

    public void playGame(){
        System.out.println("玩游戏");
    }

    public void showPrice(){
        System.out.println();
    }
}
