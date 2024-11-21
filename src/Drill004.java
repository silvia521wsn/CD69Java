import java.util.Scanner;

public class Drill004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("蔵書番号を入力してください: ");
        int bookNumber = sc.nextInt();

        // 蔵書番号を1000で割った商を取得
        int category = bookNumber / 1000;

        // ジャンルを判別
        switch (category) {
            case 0:
                System.out.println("ジャンルは 文学 です。");
                break;
            case 1:
                System.out.println("ジャンルは 社会 です。");
                break;
            case 2:
                System.out.println("ジャンルは 歴史 です。");
                break;
            case 3:
                System.out.println("ジャンルは 思想 です。");
                break;
            case 4:
                System.out.println("ジャンルは 宗教 です。");
                break;
            default:
                System.out.println("ジャンルが未登録です。");
                break;
        }

        sc.close();
    }
}
