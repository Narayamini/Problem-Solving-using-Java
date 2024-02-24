package searching.binary;

import java.util.Arrays;

/*https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
34. Find First and Last Position of Element in Sorted Array
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.
 */
public class  First_Last_Position_of_Element_34 {

    public static void main(String[] args) {

        int[] arr={5,7,7,8,8,10};
        int[] k=searchRange(arr,8);
        System.out.println(Arrays.toString(k));

    }
    public static int[] searchRange(int[] a,int target)
    {
        int[] ans={-1,-1};
        int start=search(a,target,true);
        int last = search(a,target,false);
        ans[0]= start;
        if(ans[0]!=-1)
        {
            ans[1] = last;
        }
        ans[1] = last;
        return ans;
    }
    public static int search(int[] a, int target, boolean index)
    {
        int ans=-1;
        int start =0;
        int end=a.length-1;
        int mid = start+((end-start)/2);
        while(start<=end)
        {
            mid = start+((end-start)/2);
            if(target == a[mid]) {
                ans=mid;
                if (index) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
             else if (target>a[mid]) {

                start=mid+1;
            }
            else {

                end=mid-1;
            }
        }
        return ans;
    }
    }


