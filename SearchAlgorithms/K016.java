package SearchAlgorithms;

import java.util.Arrays;

// Searching in a sorted matrix.
// Take middle column and perform binary search on it.
// O( log(N) + log(M) )

public class K016 {
    public static void main(String[] args) {
        int [] [] matrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        int target = 1;
        System.out.println(Arrays.toString(search(matrix,target)));
    }
//        Search in the row provided between the columns provided.
    static int [] binarySearch(int [][] matrix , int row , int columnStart , int columnEnd , int target){

        while( columnStart <=  columnEnd ){
            int mid = columnStart + (columnEnd-columnStart)/2;
            if(matrix[row][mid] == target){
                return new int [] {row,mid};
            }
            if(matrix[row][mid] < target){
                columnStart = mid+1;
            }
            else{
                columnEnd = mid-1;
            }
        }
        return new int [] {-1,-1};
    }

    static int [] search(int[] [] matrix , int target){
        int rows = matrix.length;
        int cols = matrix[0].length;
//        Be cautious, matrix may be empty.

//        If only 1 row is there, then index of that row = 0.
        if(rows == 1 ){
            return binarySearch(matrix,0,0,cols-1,target);
        }

        int rowStart = 0;
        int rowEnd = matrix.length -1;
        int columnMid = cols/2;
//        Run the loop till 2 rows are remaining.
        while (rowStart < rowEnd-1){  // To get 2 rows.
            int mid = rowStart + (rowEnd-rowStart)/2;
            if(matrix[mid][columnMid] == target){
                return new int [] {mid, columnMid};
            }
            if(matrix[mid][columnMid] < target){
                rowStart = mid;
            }
            else{
                rowEnd = mid;
            }
        }
//        Now we have 2 rows.
//        Check whether the target is in column of 2 rows.
        if(matrix[rowStart][columnMid] == target){
            return new int[]{rowStart, columnMid};
        }
        if(matrix[rowEnd][columnMid] == target){
            return new int[]{rowEnd, columnMid};
        }

//        Search in 1st half.
        if(target <= matrix[rowStart][columnMid -1]){
           return binarySearch(matrix,rowStart,0,columnMid-1,target);
        }
//        Search in 2nd half.
        if(target <= matrix[rowEnd ][columnMid -1]){
            return binarySearch(matrix, rowEnd,0,columnMid-1,target);
        }
//        Search in 3rd half.
        if(target >= matrix[rowStart][columnMid+1] && target <= matrix[rowStart][cols-1]){
           return binarySearch(matrix,rowStart,columnMid+1,cols-1,target);
        }
//        Search in 4th half.
        if (target >= matrix[rowEnd][columnMid+1] && target <= matrix[rowEnd][cols-1]){
           return binarySearch(matrix,rowEnd,columnMid+1,cols-1,target);
        }

        return new int [] {-1,-1};
    }
}
