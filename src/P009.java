public class P009 {
    public static void main(String[] args){
        int x = 5, y = 8;
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("x = " + x + "," + "y = " + y);
        int a = 5, b = 8;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a = " + a + "," + "b = " + b);
    }
}
