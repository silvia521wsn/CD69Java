public class P006 {
    public static void main(String[] args){
        int x=1;//整数型の変数ｘを宣言し、１を代入
        int y;//整数型の変数yを宣言
        y = 1;//yに1を代入
        System.out.println(0xFFFFFFFF);
        System.out.println(0x7FFFFFFF);
        System.out.println(0x80000000);
        x = 0x7FFFFFFF;
        x += 1;
        System.out.println(x);
    }
}
