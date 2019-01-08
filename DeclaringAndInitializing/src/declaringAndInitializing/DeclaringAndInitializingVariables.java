package declaringAndInitializing;

import java.lang.*;

/**
 * Created by balajakka on 08/10/2018.
 */
public class DeclaringAndInitializingVariables {
    public static void main(String[] args) {

        //Declaring and Initializing in 2 lines

        int myNumber;//Declaration
        String mystring1 = "Mani", mystring2  = "Cherry is elder son", mystring3 = "Dhruv is younger son";

        //System.out.println("My Number is"+myNumber);
        myNumber = 10; //initialization
        //mystring1 = "Mani";mystring2  = "Cherry is elder son"; mystring3 = "Dhruv is younger son";
       // mystring2  = "Cherry is elder son";
        //mystring3 = "Dhruv is younger son";


        //System.out.println("mystring1 ="+mystring1);
       // System.out.println("mystring2 ="+mystring2);
        //System.out.println("mystring3 ="+mystring3);
        System.out.println("mystring1 = "+mystring1+" "+";"+ "mystring2 ="+mystring2+"mystring3 ="+mystring3);

        //Declaring and Initializing in 1 line

        double myDouble = 7.50;

        System.out.println("My Double is ="+ myDouble);

        //Declaring multiple variables in 1 one
        float myFloat1,myFloat2,myFloat3;

        float myFloat4; float myFloat5; //This is also allowed

//        double myDouble1, double myDouble2; //Doesn't compile;

        int int1, int2;

        //int int3, int int4; //Doesn't compile

        //int int = 10; //doesn't compile : don't use keywords




    }
}