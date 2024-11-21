import java.util.Scanner;

public class Drill005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("蔵書番号を入力してください: ");
        int bookNumber = sc.nextInt();

        // 各ジャンルの蔵書数を配列で管理
        int[] bookCounts = {167, 586, 721, 0, 53}; // 各ジャンルの蔵書数
        String genre;

        // 蔵書番号を1000で割った商を取得
        int category = bookNumber / 1000;

        switch (category) {
            case 0:
                genre = "文学";
                break;
            case 1:
                genre = "社会";
                break;
            case 2:
                genre = "歴史";
                break;
            case 3:
                genre = "思想";
                break;
            case 4:
                genre = "宗教";
                break;
            default:
                System.out.println("ジャンルが未登録です。");
                sc.close();
                return;
        }

        // ジャンルの開始番号と終了番号を計算
        int start = category * 1000;
        int end = start + bookCounts[category] - 1;

        System.out.println("ジャンルは " + genre + " です。");

        if (bookNumber >= start && bookNumber <= end) {
            System.out.println("この本は蔵書ありです。");
        } else {
            System.out.println("この本は蔵書なしです。");
        }

        sc.close();
    }
}

