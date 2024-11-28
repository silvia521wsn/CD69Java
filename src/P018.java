public class P018 {
    public static void main(String[] args){
        boolean a = true;
        ABC:
        while (a){
            while (a){
                break ABC;
            }
        }
    }
}
