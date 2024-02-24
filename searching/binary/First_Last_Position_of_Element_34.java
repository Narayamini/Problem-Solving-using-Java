package searching.binary;
/*https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
34. Find First and Last Position of Element in Sorted Array
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.
 */
public class First_Last_Position_of_Element_34 {

    public static void main(String[] args) {

        int[] arr={1,7,7,7,8,3,7,3};
        System.out.println(binarySearch(arr,7));

    }



    public static int binarySearch(int[] a,int target, boolean pos)
    {
        int start =0;
        int end=a.length-1;
        int mid = start+((end-start)/2);
        while(start<=end)
        {
            mid = start+((end-start)/2);
            if(target == a[mid])
            {
                return mid;
            } else if (target>a[mid]) {

                start=mid+1;
            }
            else {

                end=mid-1;
            }
        }
        return -1;
    }

}
