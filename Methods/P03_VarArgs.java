public class P03_VarArgs {

    // static  int sum(int ...arr){
    //     int res=0;
    //     for(int e: arr){
    //         res+=e;
    //     }
    //     return  res;
    // }


    //below function makes us to compulsary pass int x, if we dont pass it it will throw error, even if we do not pass arr
    static  int sum(int x, int ...arr){
        int res=0;
        for(int e: arr){
            res+=e;
        }
        return  res;
    }

    public static void main(String[] args) {
        
    //    System.out.println( sum(2,3,45));
    
    //    System.out.println( sum());

    System.out.println(sum(2, 8,4,5));

    }
}
