package stringImmutability;

public class StringImmutability {
    public static void main(String[] args) {

        String hello = "Hello";
        //String is immutable, you cannot change, make it smaller or larger you can only create another string.

        String newString = hello+"World";
        newString = hello;

        System.out.println(newString+hello);

        hello.toUpperCase();

        System.out.println(hello);

        String newUpperCaseString = hello.toUpperCase();

        System.out.println(newUpperCaseString);

        String s1 = "1";
        String s2 = s1.concat("2");
        //s2.concat("3");
         s2 = s2.concat("3");


        System.out.println(s1);
        System.out.println(s2);
       // System.out.println(s3);




    }

}

