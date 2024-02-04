package searching.binary;

public class BinarySearch_OrderAgnostic {
    public static void main(String[] args) {
        int[] arr ={3,6,9,11,16,24};
        int index=0;
        if(arr[0]>arr[arr.length-1])
             index = descbinarySearch(arr,8);
        else
            index=ascbinarySearch(arr,24);
        System.out.println("Element found at index: "+index);
    }

    public static int ascbinarySearch(int[] a,int target)
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
    public static int descbinarySearch(int[] a,int target)
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

                end=mid-1;
            }
            else {

                start=mid+1;
            }
        }
        return -1;
    }
}
