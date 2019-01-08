package firstObjectcreationprogram;

/**
 * Created by balajakka on 31/12/2018.
 */
public class MyMain {

    public static void main(String[] args) {

        Person p1 = new Person();
        Person p2 = new Person();

        p1.setFirstName("Rahul");
        p1.setLastName("Gandhi");
        p1.setAge(15);

        p2.setFirstName("Cherry");
        p2.setLastName("Yamasani");
        p2.setAge(8);

        System.out.println( "My Name is " + p1.getFirstName() + " " + p1.getLastName()+".");
        System.out.println( "I am " + p1.getAge()+ " Years old.");
        System.out.println( "I want to be your PM in 2019.");

        System.out.println( "My Name is " + p2.getFirstName() + " " + p2.getLastName()+".");
        System.out.println( "I am " + p2.getAge()+ " Years old.");

    }
}