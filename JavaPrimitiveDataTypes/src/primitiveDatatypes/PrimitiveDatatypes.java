package primitiveDatatypes;

public class PrimitiveDatatypes {


    static byte b;
    static short s;
    static int i;
    static long l;
    static float f;
    static double d;
    static char c;
    static boolean boo;

    public static void main(String[] args) {

        int number = 2_147_483_647;
        int negativeNumber = -2_147_483_648;


//        width                     minimum                         maximum
//        signed    8 bit                        -128                            +127
//        signed   16 bit                     -32 768                         +32 767
//        signed   32 bit              -2 147 483 648                  +2 147 483 647
//        signed   64 bit  -9 223 372 036 854 775 808      +9 223 372 036 854 775 807

        //long max = 123456789987; // add letter l(not good) or L
        //long another_num = _2300;
        long another_num2 = 2_300;

        //float myFloat = 25.67;
        double myDouble = 30500.46;


        System.out.println("default value of byte is "+ b);
        System.out.println("default value of short is "+ s);
        System.out.println("default value of int is "+ i);
        System.out.println("default value of long is "+ l);
        System.out.println("default value of float is "+ f);
        System.out.println("default value of double is "+ d);
        System.out.println("default value of char is "+ c);
        System.out.println("default value of boolean is "+ boo);

        char ch = 'a';
//        char ch1 = 'ab';
//        char ch1 = '1';
        char greekOmega = '\u03A9';
        char romanNumberFifty = '\u216c';

        System.out.println(greekOmega);
        System.out.println(romanNumberFifty);


//
//        int i1; int i2;
//        int i3,i4,i5;
//        int i6, int i7;

//        System.out.println(i1);
    }
}
