public class P011 {
    public static void main(String[] args){ //KR形式
        {
            // ALL MAN 形式
        }
        int x, y;
        x = 1;
        y = ++x ;//postfixでは代入後に１が加算される
        y = x++ ;//prefixでは１を加算後にｙに代入される
        //x = x++ + ++x;
        System.out.println(x);
    }
}
