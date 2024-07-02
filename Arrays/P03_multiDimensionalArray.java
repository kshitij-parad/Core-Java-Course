public class P03_multiDimensionalArray {
 public static void main(String[] args) {
    String[][] roomOwner = new String[2][3];

    roomOwner[0][0]="kshitij";
    roomOwner[0][1]="Raj";
    roomOwner[0][2]="Kartik";
    roomOwner[1][0]="karan";
    roomOwner[1][1]="Priti";
    roomOwner[1][2]="kshipra";

    for(int i =0 ; i<roomOwner.length;i++){
        for(int j = 0; j<roomOwner[i].length;j++){
            System.out.print(roomOwner[i][j]);
            System.out.print("  ");
        }
        System.out.println();
    }

 }   
}
