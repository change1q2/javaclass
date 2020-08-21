package 数组;
/*
二维数组的使用：
    规定： 二维数组分为外层数组的元素，内层数组的元素
        int[] arr = new int[4][3]
        外层元素: arr[0],arr[1]等
        内层元素: arr[0][0],arr[1][2]等

5)数组元素的默认初始值
针对初始化方式一：
        int[][] arr = new int[4][3];
        外层元素初始化值为：地址值
        内层元素初始化值为：与一维数组初始化情况相同

针对初始化方式二：
        int[][] arr = new int[4][];
        外层元素初始化值为：null
        内层元素初始化值为：不能调用，否者报错



6)数组的内存解析




 */
public class ArrayTest3 {
    public static void main(String[] args){
        System.out.println("*******整型************");
        int[][] arr = new int[4][3];
        System.out.println(arr[0]);//地址值
        System.out.println(arr[0][0]);//0
 //       System.out.println(arr);//地址值

        System.out.println("*******浮点型************");
        float[][] arr1 = new float[4][3];
        System.out.println(arr1[0]);//地址值
        System.out.println(arr1[0][0]);//0.0

        System.out.println("*******字符串型************");
        String[][] arr2 = new String[4][3];
        System.out.println(arr2[0]);//地址值
        System.out.println(arr2[0][0]);//null
    }


}
