import java.time.temporal.Temporal;
import java.util.Arrays;

public class Demo5 {
    public static void main(String[] args) {
        //一维数组
//        int[] str=new int[3];
//        for (int i=0;i<=2;i++){
//            str[i]=i;
//            System.out.println(str[i]);
//        }
        int[] myArray;
        myArray=new int[4];//初始化数组
        int[] myArray1={1,23,3,44,61,74,5,32,9,8};

        /*    求数组得到和
        int sum=0;
        for (int i=0;i<myArray1.length;i++){
            sum =sum+myArray1[i];
        }
         double result=(double) sum/myArray1.length;
        System.out.println(result);*/
    //    System.out.println(max(myArray1));
      // int index=linearSearch(myArray1,44);
       // System.out.println(index);
        Arrays.sort(myArray1);//排序
        Arrays.parallelSort(myArray1);//排序
        for (int temp:myArray1){   //数组循环的一种方法
            System.out.println(temp);

        }


    }

    /*
    //数组的查找    线性查找
    public static int linearSearch(int[] param,int key)

    { for (int i=0;i<param.length;i++){
            if (key==param[i]){
                return i;
            }
        }
        return -1;
        }
        */
     //二分查找   先把数组排序，比如，由小到大
     //选择排序
    public static void selectSort(int[] param){
                 for (int i=0;i<param.length;i++){
                     for (int j=i+1;j<param.length;j++){
                         if (param[i]>param[j]){
                             int temp=param[j];
                             param[j]=param[i];
                             param[i]=temp;
                         }
                     }
                 }

    }





    /*public static int max(int... array){//...三个点表示不定参数
       int result=0;
       for(int temp:array){
           if (temp>result){
               result=temp;
           }
       }
       return result;
    }
    */

}







