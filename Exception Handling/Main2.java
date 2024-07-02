

public class Main2 {
    public static void main(String[] args) {
        
        try {
            for(int i =0;i<10;i++)
            {
                if(i ==9){
                    int x =  i/0;
                    break;
                  
                }
                System.out.println(i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        finally{
            System.out.println("finally");
        }
        System.out.println("iut funaaly");

    }
}
