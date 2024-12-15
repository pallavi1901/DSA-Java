import java.util.Scanner;

public class Array {

    public static void main(String[] args) {




//        
//        int[][] arr2D = {
//                {1,2,3}, //0th index
//                {4,5},   //1st index
//                {6,7,8}   //2nd index
//        };
        
        //input
        Scanner in = new Scanner(System.in);

        int[][] arr= new int[3][4];

        for (int row = 0; row < arr.length; row++) {
            //for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

        for (int row = 0; row < arr.length; row++) {
            //for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }


    }
}
