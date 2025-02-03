import java.util.Scanner;

public class Kadai01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("温度を入力してください（℃）：");
        double temp = sc.nextDouble();

        System.out.print("湿度を入力してください（％）：");
        double humid = sc.nextDouble();

        double fukai = 0.81 * temp
                + 0.01 * humid * (0.99 * temp - 14.3)
                + 46;

        System.out.printf("不快指数は %.2f です。\n", fukai);
    }
}


