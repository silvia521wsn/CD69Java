public class Kadai03 {
    static boolean isReasonable(int age1, int age2) {
        return (age1 + age2) > 80;
    }
    public static void main(String[] args) {
        if (isReasonable(40, 55)) {
            System.out.println("割引");
        } else {
            System.out.println("割引対象外");
        }
    }
}



