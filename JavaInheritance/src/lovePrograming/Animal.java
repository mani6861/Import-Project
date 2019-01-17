package lovePrograming;

//public class Animal {
   // public Animal(){
     //   System.out.println("I am in Animal Class");
   // }
//}

public class Animal implements AnimalInterface{
    public Animal()
    {System.out.println("I am in Animal class");}

    public int getTailLength(){
        return 5;
    }
}
