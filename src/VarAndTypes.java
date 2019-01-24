public class VarAndTypes {
    static byte b;
    static short s;
    static int i;
    static long l;
    static float f;
    static double d;
    static char c;
    static boolean boo;

    public static void main(String[] args) {
        System.out.println("The default value of byte is " + b);
        System.out.println("The default value of short is " + i);
        System.out.println("The default value of int is " + s);
        System.out.println("The default value of long is " + l);
        System.out.println("The default value of float is " + f);
        System.out.println("The default value of double is " + d);
        System.out.println("The default value of char is " + c);
        System.out.println("The default value of boolean is " + boo);

        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);

        char cMin = '\u0000';
        char cMax = '\uffff';
        boolean bMin = true;
        boolean bMax = false;

        System.out.println(cMin);
        System.out.println(cMax);
        System.out.println(bMin);
        System.out.println(bMax);

    }
}
