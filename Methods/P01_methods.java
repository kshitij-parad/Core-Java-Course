
public class P01_methods {

    // 1] 
    static int logic(int x, int y) {
        System.out.println("withiout object");
        if (x > y) {
            return x + y;
        } else {
            return x * y;
        }
    }

    // 2] 

    int logic2(int x, int y) {
        System.out.println("With object");
        if (x > y) {
            return x + y;
        } else {
            return x * y;
        }
    }

    public static void main(String[] args) {

        // there  are two ways of calling method
        // 1] 
        int c = logic(7, 6);
        System.out.println(c);

        //2]
        P01_methods p = new P01_methods();
        int c1 = p.logic2(7, 6);
        System.out.println(c);

    }
}
