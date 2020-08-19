package 数组;
/*
数组默认元素的初始化值
    >数组元素是整型; int  short  ===> o
    >数组元素是浮点型; double    ===> o.0
    >数组元素是字符型; char  ===> o或‘、u0000’，而非‘0’
    >数组元素是boolean型，false true

    >引用数据类型:null

P12  25
数组的内存解析

 */
public class ArrayTest1 {
    public static void main(String[] args) {
        //数组没有赋值时系统会默认赋值0

        System.out.println("*****整型****");

        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("****浮点型*****");

        double[] arr1 = new double[4];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        System.out.println("*****字符型****");

        char[] arr2 = new char[4];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr2[i]);
        }
        if(arr2[0] == 0){
            System.out.println("你好");
        }
 
        System.out.println("*****boolean型****");

        boolean[] arr3 = new boolean[4];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr3[i]);
        }

        System.out.println("*****引用数据类型****");

        String[] arr4 = new String[4];
        System.out.println(arr4[0]);
        if(arr4[0] == null){
            System.out.println("北京天气不错！");
        }
    }
}
