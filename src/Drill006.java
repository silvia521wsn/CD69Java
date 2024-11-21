import java.util.Scanner;

public class Drill006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 各ジャンル名と蔵書数を定義
        String[] genres = {"文学", "社会", "歴史", "宗教"};
        int[] bookCounts = {167, 586, 721, 53};

        System.out.print("ジャンル番号を入力してください (0: 文学, 1: 社会, 2: 歴史, 3: 宗教): ");
        int genreIndex = sc.nextInt();

        // ジャンル番号で処理
        switch (genreIndex) {
            case 0:
            case 1:
            case 2:
            case 3:
                System.out.println(genres[genreIndex] + " の蔵書は " + bookCounts[genreIndex] + " 冊です。");
                break;
            default:
                System.out.println("ジャンル番号が無効です。");
        }

        sc.close();
    }
}

