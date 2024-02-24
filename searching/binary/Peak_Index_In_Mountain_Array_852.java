package searching.binary;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
//mountain array or bitonic array
public class Peak_Index_In_Mountain_Array_852 {

    public static void main(String[] args) {
        int[] arr= {0,10,5,2};
        System.out.println(peakIndexInMountainArray(arr));
    }

public static int  peakIndexInMountainArray(int[] arr) {

        int start=0;
        int end= arr.length-1;
        int ans=arr[0];
        while(start!=end)
        {
            int mid = start +((end-start)/2);
            if(arr[mid]<arr[mid+1])
            {
                start=mid+1;
            } else if (arr[mid]>arr[mid+1]) {
                end=mid;
            }
        }
        return start;
    }
}
