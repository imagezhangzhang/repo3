import java.util.Scanner;

public class demo1 {

    public static void main(String[] args) {

      /*  Scanner input=new Scanner(System.in);
        System.out.println("");
        int year=input.nextInt();

        boolean isLeapYear=(year%4==0&&year%100!=0)||(year%400==0);
        if (isLeapYear){
            System.out.println("闰年");
            }
        else
        {
            System.out.println("no leapYear");
            }

  int a=6;
        switch(a) {
            case 0:
                System.out.println("您输入的是" + 0);
            case 6:
                System.out.println("yes 6");
                default:
                    System.out.println("条件都不满足");


        } */

       /* int c;                  Math方法
        c=Math.min(3,4);
        System.out.println(c);
        System.out.println(Math.pow(2,3));
        System.out.println((int)(Math.random()*10));//  随机返回0<math.random()<1
        */


       //字符类型
      /*  char b='a';//char 装单个字符
        String a="sfsavs";
        System.out.println((int)b);
        String str="欢迎";
        String str1="ni hao";
        System.out.println(str);

        System.out.println(str1.toUpperCase());//转换成大写字母
        System.out.println(str1.length());
        System.out.println(str1.charAt(1));
        System.out.println(str1.trim());//去除最后的空格
        System.out.println(str1.substring(1));//从某个位置开始，截取去除前面的
        */
      String a="abc";
      String  b="abf";
        System.out.println(a==b);//比较两字符串的内存地址，并不是比较内容
        System.out.println(a.equals(b));//比较a,b是否相等
        System.out.println(a.compareTo(b));//比较字符串的比较 比较字典顺序   相等返回0  前面的大返回大于0


    }
}
