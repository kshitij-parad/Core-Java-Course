
class Employee {

    private int id;
    private String name;

    public Employee() {
        id = 001;
        name = "Employee" + 001;

    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Employee(int id) {
        this.id = id;
    }

    // it is not always necessary to setId and name by creating function, we can do that using contructor also..

    // void setId(int id){
    //     this.id = id;
    // }
    // void setName(String name){
    //     this.name =name;
    // }
    
    int getId() {
        return id;
    }

    String getName() {
        return name;
    }

}

public class P01_Contructor {

    public static void main(String[] args) {
        Employee e1 = new Employee();
        System.out.println(e1.getId() + " " + e1.getName());

        Employee e2 = new Employee(101);
        System.out.println(e2.getId() + " " + e2.getName());

        Employee e3 = new Employee(102, "Raj");
        System.out.println(e3.getId() + " " + e3.getName());

    }

}
