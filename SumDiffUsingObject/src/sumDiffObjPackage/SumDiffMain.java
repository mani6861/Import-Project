package sumDiffObjPackage;

public class SumDiffMain {
    public static void main(String[] args) {
        SumDiffMethods obj1= new SumDiffMethods();
        obj1.c = obj1.sum( 125, 24);
        obj1.sub( 125, 24 );
        System.out.println(obj1.c, obj1.d);

    }
}
