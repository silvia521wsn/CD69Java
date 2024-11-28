public class Drill010 {
    public static void main(String[] args){
        int n = 0;
        while(n < 5){
            System.out.print(++n);
            if(n<5) System.out.print('-');
        }
    }
}
