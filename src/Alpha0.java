import java.util.Scanner;

public class Alpha0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char alpha = sc.next().charAt(0);

        if ('A' <= alpha && alpha <= 'Z') {
            System.out.println("大文字");
        } else if ('a' <= alpha && alpha <= 'z') {
            System.out.println("小文字");
        }

        sc.close();
    }
}