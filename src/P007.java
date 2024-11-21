public class P007 {
    public static void main(String[] args){
        byte a;//-128~127
        short s;//-32768~32767
        long l;//8byte

        float f;//単精度浮動小数点
        double d;//倍精度浮動小数点

        char c;//2byte
        boolean b;//論理型 true false

        b = true;
        c = 'A';
        d = 3.14;
        f = 3.14f;
        l = 3000000000L;
        a = 127;
        s = 32767;

        d = c;
        int i;
        i = 3;
        i = 7;
        System.out.println(i);
    }
}
