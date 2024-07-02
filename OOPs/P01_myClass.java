class Person{
    int age;
    int salary;
    String name;

    void printDetails(){
        System.out.println("Name: "+ name);
        System.out.println("Name: "+age);
        System.out.println("Name: "+salary);
    }

    int getSalary(){
        return  salary;
    }
}


public class P01_myClass{
    public static void main(String[] args) {
        
        Person p1 = new  Person();
        Person p2 = new  Person();

        p1.name = "Kshitij";
        p1.age = 10;
        p1.salary = 5000;

        p1.printDetails();
        System.out.println(p1.getSalary());


        p2.name = "Prit";
        p2.age = 20;
        p2.salary = 7000;

        p2.printDetails();
        System.out.println(p2.getSalary());
    }
}