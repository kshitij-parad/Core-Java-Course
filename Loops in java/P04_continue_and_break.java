public class P04_continue_and_break {
    public static void main(String[] args) {
        
        //Break

        // for(int i = 0; i<12;i++){
        //     System.out.println(i);

        //     if(i == 3){
        //         System.out.println("breaking loop");
        //         break;
        //     }
        //     // System.out.println("in loop "); 
        // }
        // System.out.println("loop breaked");



        //COntinue

        for(int i = 0 ;i<19;i++){

            if(i==3){
                System.out.println("halting loop for i==3 ");
                continue;
                // System.out.println("loop halted"); //error: unreachable statement
            }
            System.out.println(i);
        }
    }
}
