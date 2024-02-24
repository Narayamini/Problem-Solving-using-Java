package searching.binary;

//Find Floor of given number, Floor is nothing but we have to find the biggest number which is <=target number

public class Floor {

    public static void main(String[] args) {

        int[] arr={2,3,5,9,14,16,19};
        System.out.println(ceilNumber(arr,10));

    }

    public static int ceilNumber(int[] arr, int target)
    {
        int start=0;
        int end = arr.length-1;

        int mid = start+((end-start)/2);
        while(start<=end)
        {
            mid = start+((end-start)/2);
            if(target == arr[mid])
            {
                return mid;
            } else if (target>arr[mid]) {

                start=mid+1;
            }
            else {

                end=mid-1;
            }
        }
        return arr[end];
    }
    }
