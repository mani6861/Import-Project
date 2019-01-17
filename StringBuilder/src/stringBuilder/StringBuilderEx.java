package stringBuilder;

public class StringBuilderEx {
    public static void main(String[] args) {
        String myString = "";

        for(char c = 'a'; c<='z';c++){
            myString=myString+c;
        }

        System.out.println(myString);

        StringBuilder sb = new StringBuilder();

        for(char c = 'a';c<='z';c++){
            sb.append(c);
        }

        System.out.println(sb);

        StringBuilder builder = new StringBuilder("Start");
        builder.append("-Middle");
        System.out.println(builder);
        StringBuilder anotherStringBuilder = builder.append("-End");
        System.out.println(anotherStringBuilder);

        //String str = anotherStringBuilder.append("HashCode").toString();

        System.out.println(System.identityHashCode(builder));
        System.out.println(System.identityHashCode(anotherStringBuilder));

        StringBuilder myBuilder = new StringBuilder();
        System.out.println("size is = "+myBuilder.length());
        System.out.println("capacity is ="+myBuilder.capacity());



    }
}

