import java.util.EmptyStackException;
import java.util.Scanner;

public class demo2{
    public static void main(String[] args) {
        //准备好两个数字，  让用户猜
        String lottery=""+(int)(Math.random()*10)+(int)(Math.random()*10);
        //等待用户输入两个数字，两位数

        Scanner input=new Scanner(System.in);

        while (true) {
            System.out.println("请输入两位数字:");
            String guess = input.nextLine();
            //切分系统随机的数字准备比较
            char lotteryDigital1 = lottery.charAt(0);
            char lotteryDigital2 = lottery.charAt(1);
            char guess1 = guess.charAt(0);
            char guess2 = guess.charAt(1);
            System.out.println("彩票的号码是:" + lottery);
            //比较用户和彩票
            if (guess.equals(lottery)) {
                System.out.println("恭喜你，运气太好了");
                break;

            } else if (guess1 == lotteryDigital2 && guess2 == lotteryDigital1) {
                System.out.println("恭喜你猜中了，但是顺序不一样");
                break;

            } else if (guess1 == lotteryDigital1 || guess2 == lotteryDigital1 || guess1 == lotteryDigital2 || guess2 == lotteryDigital2) {
                System.out.println("恭喜你猜中一个");
                break;
            } else {
                System.out.println("抱歉 你什么都没猜中");
            }

        }

    }
}
