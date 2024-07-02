 //QUE 1:
 class Employee{
    int salary;
    String name;

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return  this.name;
    }

    int getSalary(){
        return  this.salary;
    }

    void  setSalary(int salary){
        this.salary = salary;
    }
}

public class P02_PracticeSet {


    public static void main(String[] args) {
        
            Employee e1 = new Employee();
            Employee e2 = new Employee();

            e1.setName("Kshitij");
            e1.setSalary(5000);

            System.out.println(e1.getName());
            System.out.println(e1.getSalary());


            e1.setName("harshhh");
            e1.setSalary(3000);

            System.out.println(e1.getName());
            System.out.println(e1.getSalary());
    }
}
