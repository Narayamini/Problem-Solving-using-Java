package searching.binary;

public class InfiniteArray {
    //https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
    public static void main(String[] args) {
        int[] arr ={3,6,9,11,16,24,45,89};
        int index = ans(arr,24);
        System.out.println("Element found at index: "+index);
    }
    static int ans(int[] arr, int target)
    {
        int start=0;
        int end=1;
        while(target>arr[end])
        {
            int newStart=end+1;
            end=end+(end-start+1)*2;
            start=newStart;
        }
        return binarySearch(arr,target,start,end);
    }

    public static int binarySearch(int[] a,int target,int start,int end)
    {

        int mid = 0;
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
