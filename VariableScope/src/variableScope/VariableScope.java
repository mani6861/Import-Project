package variableScope;

public class VariableScope {
    int myGlobalint = 5;
    public static void main(String[] args) {

        int myLocalint = 10;
        VariableScope vs2 = new VariableScope();

        {
            int myCodeblockInt = 100;
            System.out.println(myCodeblockInt);
        }
        System.out.println(vs2.myGlobalint);

//        int mycodeblockInt = 200;
//
//        System.out.println(mycodeblockInt);

        VariableScope vs = new VariableScope();
        vs.myMethod();

    }

    void myMethod(){

        System.out.println();
    }
}

