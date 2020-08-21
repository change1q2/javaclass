package 数组;
/*
二维数组的使用：
1.理解
1)对于二维数组的理解，我们可以看成是一位数组array1作为另一个一维数组array2的元素而存在
2)其实，从数组底层的运行机制来看，其实没有多维数组

2.二维数组的使用
1)二维数组的声明和初始化
2)如何调用数组的指定位置的元素
3)如何获取数组的长度
4)如何遍历数组
5)数组元素的默认初始值
6)数组的内存解析
 */

public class ArrayTest2 {
    public static void main(String[] args){
        //1.二维数组的声明和初始化
        //1）静态初始化
        int[] arr = new int[]{1,2,3};//一维数组的静态初始化
        int[][] arr1 = new int[][]{{1,2,3},{4,5},{6}};//二维数组的静态初始化

        //2）动态初始化
        String[] arr2_1 = new String[3];//一维数组的动态初始化
        arr2_1[0] = "小海";
        arr2_1[1] = "小军";
        arr2_1[2] = "小王";

        String[][] arr2 = new String[3][2];//二维数组的动态初始化
        String[][] arr3 = new String[3][];//内层不赋值表示对立面还不知道指向几个空间



        //正确但不标准的写法
        int[] arr4[] = new int[][]{{1,2,3},{4,5,6}};
        int[] arr5[] = {{1,2,3},{4,5,6}};

        System.out.println("***********调用2维数组里面的存在的值2***************");
        //2.如何调用2维数组的值
        int[][] arr6 = new int[][]{{1,2,3},{4,5},{6}};//例如要调用里面的2
        System.out.println(arr6[0][1]);//2

        System.out.println("***********调用2维数组里面的不存在的值***************");
        String[][] arr7 = new String[3][2];//没有赋值取出来是Null
        System.out.println(arr7[1][1]);//null

        System.out.println("***********空指针错误时先指定指针再调用***************");
        String[][] arr8 = new String[3][];//在内层数组没有指定值的时候去调用里面的值会报错
     //   System.out.println(arr8[1][1]);//空指针异常
        //如果要调的话先指定元素
        arr8[1] = new String[4];
        System.out.println(arr8[1][0]);



        System.out.println("***********获取2维数组里面的长度***************");
        //3.获取二维数组的长度
        int[][] arr9 = new int[][]{{1,2,3},{4,5},{6}};//二维数组的静态初始化
        System.out.println(arr9.length);//3  取得是最外层有几个元素取几个这一层有{1,2,3},{4,5},{6}这个3个元素
        System.out.println(arr9[0].length);//3 取得下标为0的元素里面的元素这一层有{1，2，3}里面种的1，2，3 3个元素
        System.out.println(arr9[1].length);//2 取得下标为1的元素里面的元素这一层有{4，5}里面种的4，5 2个元素


        System.out.println("***********遍历二维数组***************");
        //4.如何遍历二维数组
        int[][] arr10 = new int[][]{{1,2,3},{4,5},{6}};//二维数组的静态初始化
        for(int i = 0;i < arr10.length;i++){
            for(int j = 0;j < arr10[i].length;j++){
                System.out.println(arr10[i][j] + "");
            }
            System.out.println();
       }
   }
}
