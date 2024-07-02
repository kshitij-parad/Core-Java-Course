class first{
     int x = 7;
    protected  int y=8;
} 

class second extends  first{
    void meth(){
        System.out.println("Deafault: "+x+" Potected: "+y);
    }
}

public class Problem3 {
    public static void main(String[] args) {
        second s =new second();
        s.meth();
    }
}
