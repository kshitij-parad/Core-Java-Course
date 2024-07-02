public class P01_Main{
    public static void main(String[] args) {
        int a = 9;
        int b =0;

        //withot exception handling
        // System.out.println(a/b);


        //with hadling
        // try{
        //     System.out.println(a/b);
        // }
        // catch(Exception e){

        //     System.out.println(e);
        // }

        // System.out.println("after");




        for(int i =0 ; i<1000;i++){
            try {
                System.out.println("Loading storiess.....");
               
                System.out.println("Server relaoding....");
            } catch (Exception e) {
            }
        }
    }
}