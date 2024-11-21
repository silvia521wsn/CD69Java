import java.util.Scanner;

public class Drill002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int budget = 1000;

        System.out.print("金額を入力してください: ");
        int amount = sc.nextInt();

        if (amount < 0) {
            System.out.println("入力ミス");
        } else if (amount < budget) {
            int change = budget - amount;
            System.out.println("おつりは " + change + " 円です");
        } else {
            System.out.println("予算オーバー");
        }

        sc.close();
    }
}

