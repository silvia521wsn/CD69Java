import java.util.Scanner;

public class Kadai02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalH = 0;

        for (int i = 0; i < 5; i++) {
            System.out.printf("身長を入力してください（cm）[%d/5]：", i + 1);
            int height = sc.nextInt();
            totalH += height;
        }

        int ave = totalH / 5;
        System.out.println("平均身長は " + ave + " cm です。");
    }
}


