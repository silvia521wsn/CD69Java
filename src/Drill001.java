import java.util.Scanner;

public class Drill001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("リンゴの単価を入力してください: ");
        int price = sc.nextInt();

        System.out.print("リンゴの数量を入力してください: ");
        int quantity = sc.nextInt();

        int total = price * quantity;

        System.out.println("合計金額は " + total + " 円です。");

        sc.close();
    }
}
