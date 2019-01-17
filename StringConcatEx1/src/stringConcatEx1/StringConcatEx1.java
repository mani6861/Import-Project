package stringConcatEx1;

public class StringConcatEx1 {
    String myString = "";

    {
        for (int i = 20; i >= 1; i--) {
            myString = myString + i;
        }
        System.out.println(myString + " ");

    }
}