package 面向对象.day9.P18再谈方法.方法的重载1;
/*
方法的重载(overload) loading.....  加载中

1.定义:在一个类中，允许存在一个以上的同名方法，只要他们参数个数或者参数类型不同即可

2.举例：
    Arrays类中重载的sort()  /binarySearch()


 */
public class overload {
    public static void mian(String[] args){

    }

    //如下的两个同名方法构成了重载
    //反转数组

    public void reverse(int[] arr){
        for (int i = 0; i < arr.length / 2 ; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - i -1];
            arr[arr.length - i -1] = temp;
        }
    }

    public void reverse(String[] arr){

    }
}
