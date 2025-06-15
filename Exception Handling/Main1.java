
//finally will get executed, in some cases(like below), sometimes it wont work means writing finally will not make any difference. 
//in below ex if we remove all return statemrns then writing finally and not writing it will not make any difference
// we can write code for cleaning or clering of resources of systemm

//basically finally block is used when we have to do something that must be executed before termination of code,

//yes, we can not write try without catch, but we can write try with finally without wroting catch

public class Main1 {

    public  static int checkk(){
        int a=5;
        int v = 9;

        try {
           int c=  a + v;
           int d = c/0;
            return d; 
        } 
        catch (Exception e) {
            System.out.println(e);
        }
        finally{
            System.out.println("this is finally");
        }
        return  0;
    }

    public static void main(String[] args) {
        
        int ans = checkk();
        System.out.println(ans);
    }
}
