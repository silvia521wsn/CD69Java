public class P015 {
    public static void main(String[] args){
        boolean rule = true;
        int n = 0;
        while(rule) {
            n++;
            if(n > 3) rule = false;
            System.out.println("NEEC");
        }
    }
}
