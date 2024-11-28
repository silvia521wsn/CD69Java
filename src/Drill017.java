public class Drill017 {
    public static void main(String[] args){
        char c = 'A';
        int n = 0;
        while(n++ < 5){
            System.out.print(c);
            c^=32;
        }
    }
}
