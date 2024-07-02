public class P01_ifElse{
    public static void main(String[] args) {
        int age = 18;

        //if else
        // if(age>18){
        //     System.out.println("Yes, You can drive");
        // }
        // else{
        //     System.out.println("You cant drive");
        // }



        //if-else Ladder
        if(age>18){
            System.out.println("you can drive");
        }
        else if(age==18){
            System.out.println("you can apply for license");
        }
        else{
            System.out.println("You can't drive");
        }
    }
}