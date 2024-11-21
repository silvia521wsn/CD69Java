import java.util.Scanner;

public class Drill003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("リンゴの単価を入力してください: ");
        int price = sc.nextInt();

        System.out.print("リンゴの数量を入力してください: ");
        int quantity = sc.nextInt();

        int total = price * quantity;

        int taxIncludedTotal = (int)(total * 1.08);

        System.out.println("合計金額（税込）は " + taxIncludedTotal + " 円です。");

        sc.close();
    }
}

