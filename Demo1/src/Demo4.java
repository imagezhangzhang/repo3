import java.security.PublicKey;

public class Demo4 {
    public static void main(String[] args) {
        //方法 面向对象语言中一般叫方法    函数
        //方法  可以用于定义可重用的代码 以及更好的组织和简化代码

//        int sum=0;
//        for (int i=1;i<=10;i++){
//            sum=sum+i;
//
//        }
//        System.out.println(sum);
     int num=max(3,5);
        System.out.println(num);

    }
    //修饰符     //返回值类型     //方法名称   //参数
//    public  static int sum(int start,int end){
//        int result=0;
//        for (int i=start;i<=end;i++){
//            result=result+i;
//        }
//        return result;
//
//    }
    public static int max(int num1,int num2){
        if (num1>num2){
            return num1;
        }else {
            return num2;
        }
    }
}
