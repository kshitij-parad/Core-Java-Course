public class P01_Array{
    public static void main(String[] args) {
        
        // int[] arr = new int[5]

        // int[] arr;
        // arr= new int[6];

        // int[] arr = {19,10,101,01};

        int[] arr = new int[5];

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        System.out.println(arr[4]);
        // System.out.println(arr[9]); //java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 5
    }
}