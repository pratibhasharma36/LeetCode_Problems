package Arrays;

public class A014 {
    public static int heightChecker(int[] heights) {
        int [] expected = new int [heights.length];

        for(int firstUnsortedIndex = 0; firstUnsortedIndex < expected.length; firstUnsortedIndex++){
            int newElement = heights[firstUnsortedIndex];
            int i ;
            for ( i =  firstUnsortedIndex; i>0 && expected[i-1]> newElement; i--) {
                expected[i] = expected[i-1];
            }
            expected[i] = newElement;
        }

        for (int i = 0; i < expected.length; i++) {
            System.out.print(expected[i] +" ");
        }
        System.out.println();
            int numberOfDifferentElements = 0;
        for (int index = 0; index < expected.length; index++) {
            if(expected[index] != heights[index] ){
                numberOfDifferentElements++;
            }
        }

        return numberOfDifferentElements;
    }

    public static void main(String[] args) {
        int [] heights ={1,1,4,2,1,3};
        System.out.println(heightChecker(heights));
    }
}
