public class P013 {
    public static void main(String[] args){
        int age = 18;
        if(age < 0){
            System.out.println("適切な値ではありません");
        }else if (0 <= age && age < 18) {
            System.out.println("未成年");
        }else {
            System.out.println("成年");
        }
    }
}
