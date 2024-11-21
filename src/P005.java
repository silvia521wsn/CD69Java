public class P005 {
    public static void main(String[] args){
        //または(OR)
        System.out.println(false||false);
        System.out.println(false||true);
        System.out.println(true||false);
        System.out.println(true||true);
        //かつ(AND)
        System.out.println(false&&false);
        System.out.println(false&&true);
        System.out.println(true&&false);
        System.out.println(true&&true);
        //否定(NOT)
        System.out.println(!false);
        System.out.println(!true);

        System.out.println(3>5 || 2<4);
        System.out.println(3L!=3.0f);

        System.out.println(true?9:6);
        System.out.println(false?9:6);
        System.out.println((3>5)?9:6);

    }
}
