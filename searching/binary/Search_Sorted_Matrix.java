package searching.binary;

import java.util.Arrays;

public class Search_Sorted_Matrix {
    public static void main(String[] args) {
        int[][] arr={{10,20,30,40},{15,25,35,45},{28,29,37,49},{33,34,38,50}};
        System.out.println(Arrays.toString(search(arr,49)));
    }

    static int[] search(int[][] matrix,int target)
    {
        int row=0;
        int column=matrix.length-1;
        while(row < matrix.length && column>=0)
        {

            int[] ans =new int[2];
            if(target==matrix[row][column])
            {
                return new int[]{row,column};
            }
            else if(target<matrix[row][column])
            {
                column--;
            }
            else
            {
                row++;
            }
        }
        return new int[]{-1,-1};
    }

}
