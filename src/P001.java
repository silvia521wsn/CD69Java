public class P001 {
    public static void main(String[] args){
        System.out.println(0b1101);//２進表記
        System.out.println(015);//８進表記では先頭に０を置く
        System.out.println(13);//１０進表記
        System.out.println(0xD);//１６進表記
        System.out.println(3.14);//64bit長のリテラル
        System.out.println(3.24f);//32bit長のリテラル(丸め誤差に注意)
        System.out.println(0.1f+0.1f+0.1f+0.1f+0.1f+0.1f+0.1f+0.1f+0.1f);
        System.out.println((char)(65+1));
        System.out.println((int)'A');
        System.out.println((char) ('A'+1));
        System.out.println('\u49b1');
        System.out.println(1e1);
        System.out.println(3>5);
        System.out.println('\n');
        System.out.println('あ');
        System.out.println("あいうえお");
    }
}
