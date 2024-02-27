package searching.binary;
//https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/
public class Rotations_In_rotated_Array {

    public static void main(String[] args) {
        int[] arr= {6,7,9,0,1,2,3,4,5};
////        int[] arr={3,4,5,6,7,1,2};
//        int[] arr= {1,3
        System.out.println(search(arr)+1);


    }


    public static int search(int[] arr) {

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
    }}
