package classConstructors;

class Car{

    private String carType;
    private String carColour;
    private String gearType;
    public Car(){}

    public Car(String type){
        carType = type;
    }

    public Car(String type, String carColour){
        carType = type;
        this.carColour = carColour;
    }

    public Car(String type, String carColour, String gearType){
        carType = type;
        this.carColour = carColour;
        this.gearType = gearType;
    }

    //    public car(){}
    public void Car(){}

    public void printCarType(){
        System.out.println("This car type is " + carType);
    }

    public void printCarColour(){
        System.out.println("This car colour is " + carColour);
    }

    public void printGearType(){
        System.out.println("This car gear type is " + gearType);
    }
}

public class ClassConstructors {
    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car("Sedan");

        Car car3 = new Car("Hatch Back","White");
        Car car4 = new Car("SUV","Black","Automatic");

        System.out.println("******* Car Colour");
        car1.printCarColour();
        car2.printCarColour();
        car3.printCarColour();
        car4.printCarColour();
//        System.out.println("******* Car Colour");

        System.out.println("******* Car Types");
        car1.printCarType();
        car2.printCarType();
        car3.printCarType();
        car4.printCarType();
//        System.out.println("******* Car types");

        System.out.println("******* Gear Types");
        car1.printGearType();
        car2.printGearType();
        car3.printGearType();
        car4.printGearType();
//        System.out.println("******* Gear Types");


    }
}