package searching.binary;
//https://leetcode.com/problems/search-in-rotated-sorted-array/description/
public class Search_In_Rotated_Array_33 {

    public static void main(String[] args) {
//        int[] arr= {4,5,6,7,0,1,2};
////        int[] arr={3,4,5,6,7,1,2};
        int[] arr= {1,3};
        int k = search(arr);
        System.out.println(search(arr));
        find(arr,4,k);
        System.out.println(find(arr,4,k));

    }
    public static int find(int[] arr, int target, int pivot)
    {

        int index=0;
        if(pivot==-1)
        {
            return orderAgnosticBS(arr, target,0,arr.length-1);
        }
        if(pivot==arr.length-1)
        {
            index=orderAgnosticBS(arr,target,pivot,arr.length-1);
        }
        else
            index=orderAgnosticBS(arr,target,pivot+1,arr.length-1);

        if(arr[pivot]==target)
        {
            return pivot;
        }
        if(index==-1) {
            if(pivot==0)
            {
                return orderAgnosticBS(arr, target, 0, pivot); }
            else
                return orderAgnosticBS(arr, target, 0, pivot-1);
        }
        else
            return index;

    }
    static int orderAgnosticBS(int[] arr, int target, int start, int end) {
        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    public static int  search(int[] arr) {

        int start=0;
        int end= arr.length-1;
        while(start<=end)
        {
            int mid = start +((end-start)/2);
             if (mid<end && arr[mid]>arr[mid+1]) {
                return mid;
            }
             else if (mid>start && arr[mid]<arr[mid-1]) {
                 return mid-1;
             }
             else if(arr[start]>=arr[mid])
             {
                 end=mid-1;
             }
             else
                 start=mid+1;
        }
        return -1;
    }
}
