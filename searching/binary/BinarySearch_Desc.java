package searching.binary;

public class BinarySearch_Desc {
    public static void main(String[] args) {
            int[] arr ={52,45,36,24,11,9,8};
            int index = binarySearch(arr,8);
            System.out.println("Element found at index: "+index);
        }
        public static int binarySearch(int[] a,int target)
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


