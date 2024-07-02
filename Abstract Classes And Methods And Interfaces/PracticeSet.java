
// abstract  class Pen{
//     abstract   void write();
//     abstract  void reFill();
// }

// // Que:2 
// class FountainPen extends   Pen{
// void write(){
//     System.out.println("Writing usinng Fountain Pen");
// }

// void  reFill(){
//     System.out.println("Refilling Fountain pen");
// }

// void changeNib(){
//     System.out.println("changin nib of Fountain Pen");
// }
// }


//QUE 3 
class Monkey{
    void bite(){
        System.out.println("biting");
    }

    void jump(){
        System.out.println("jumping");
    }
}

interface  BasicAnimal{
    void eat();
    void sleep();
}

class Human extends Monkey implements  BasicAnimal{

    public  void   eat(){
        System.out.println("Human Eating");
    }

    public  void sleep(){
        System.out.println("Human Sleeping");
    }

}

public class PracticeSet {
    public static void main(String[] args) {

        //Que 2
        // FountainPen fp1 = new FountainPen();
        // fp1.write();
        // fp1.reFill();
        // fp1.changeNib();


        //Que 3:

        Human h1 = new Human();
        h1.eat();
        h1.sleep();
        h1.bite();
        h1.jump();

        Monkey m1 = new Human();
        m1.bite();
        m1.jump();

    }
}
