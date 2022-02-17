package SearchAlgorithms;

import java.util.Arrays;
// Searching in 2-D arrays.
public class K015 {
    public static void main(String[] args) {
        int [] [] matrix = {
                {10 , 20 , 30 , 40},
                {15 , 25 , 35 , 45},
                {28 , 29 , 37 , 49},
                {33 , 34 , 38 , 50}
        };
        int target = 37;
        System.out.println(Arrays.toString(search(matrix,target)));
    }
    static int [] search(int [] [] matrix , int target){
        int row = 0;
        int column = matrix.length - 1;

        while (row < matrix.length && column >= 0){
          if(matrix[row][column] == target){
              return new int []{row,column};
          }
          if(matrix[row][column] < target){
              row++;
          }else{
              column--;
          }
        }

        return new int [] {-1,-1};
    }
}
