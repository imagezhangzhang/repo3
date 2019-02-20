import java.util.Scanner;

public class Demo7 {
    //普通代码块   构造代码块  静态代码块
    public static void main(String[] args) {
  String s1="welacmoe";

  String s2=s1.split("a")[0];//split表示切分字符串
  String s3=s1.split("a")[1];
       // System.out.println(s2 +" "+s3);
//regx   正则表达式
        boolean result="java to learn".matches("java.*");//*表示通配符  只要以java开头的都匹配
      //  System.out.println(result);
      // StringBuilder   StringBuffer 可以对字符串进行修改，append表示添加

        StringBuilder builder=new StringBuilder("wang");
        StringBuffer buffer=new StringBuffer();
        builder.append("sdsd").append(1234).append("asd");
        System.out.println(builder.toString());
        // 区别   builder线程不安全 效率高  buffer线程安全

    }
}
