
import java.util.Scanner;

public class P04_PractiveSet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //QUE 1
        // int[][] mat1 = new int[2][3];
        // int[][] mat2 = new int[2][3];
        // int[][] sumMat = new int[2][3];

        // for (int i = 0; i < mat1.length; i++) {
        //     for (int j = 0; j < mat1[i].length; j++) {
        //         System.out.printf("Enter valaue for (%d , %d) mat 1: ", i, j);
        //         mat1[i][j] = sc.nextInt();
        //     }
        // }
        // for (int i = 0; i < mat2.length; i++) {
        //     for (int j = 0; j < mat2[i].length; j++) {
        //         System.out.printf("\nEnter valaue for (%d , %d) of mat 2: ", i, j);
        //         mat2[i][j] = sc.nextInt();
        //     }
        // }

        // for (int i = 0; i < mat1.length; i++) {
        //     for (int j = 0; j < mat1[i].length; j++) {
        //         sumMat[i][j] = mat1[i][j] + mat2[i][j];
        //     }
        // }

        // for (int i = 0; i < mat1.length; i++) {
        //     for (int j = 0; j < mat1[i].length; j++) {
        //         System.out.print(sumMat[i][j]);
        //         System.out.print(" ");
        //     }
        //     System.out.println();
        // }


        //Que 2:
        int key = 5;
        int[] arr = {101,393,3838,3,5,6};

        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.printf("Element is present in array at %dth Index.",i);
            }

        }

    }
}
