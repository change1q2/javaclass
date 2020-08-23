package 面向对象;
/*
类中属性的使用

属性(成员变量) VS 局部变量
1.相同点：
    1）定义变量的格式:数据类型  变量名 = 变量值
    2）先声明，后使用
    3）变量都有其对应的作用域



2.不同点：
    1)在类中声明的位置不同
    属性：直接定义在类的一对{}内
    局部变量：声明在方法内、方法形参、代码块内、构造器形参、构造器内部变量

    2)关于全县修饰符的不同
    属性：可以在声明属性时，指明其权限，使用权限修饰符。
    常用的权限修饰符：private、public、缺省、protected ---封装性
    目前：大家声明属性时，都使用缺省就可以

    3)默认初始化值的情况：
    属性：类的属性、根据其类型、都有默认初始化值
        整型(byte、short、int、long)  0
        浮点型(float、double) 0.0
        布尔型(boolean) false
        引用数据类型(类、数组、接口) null

    局部变量：没有默认初始化值
        意味着：我们在调用局部变量之前，一定要显示赋值
        特别的：形参在调用时，我们赋值即可。u1.talk("中文")

     4)在内存中的加载位置不一样
     属性：加载到堆空间
     局部变量：加载到栈空间

 */

public class UserTest {
    public static void main(String[] args){
        User u1 = new User();
        System.out.println(u1.name);
        System.out.println(u1.age);
        System.out.println(u1.isMale);

        u1.talk("中文");
        u1.eat();

    }
}

class User{
    //属性(或成员变量)
    String name;
    int age;
    boolean isMale;

    public void talk(String language){//()里面的language叫做形参
        System.out.println("我们使用" + language + "进行交流");

    }

    public void eat(){
        String food = "大饼";//局部变量
        System.out.println("北方人喜欢吃：" + food);
    }

}