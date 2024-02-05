package searching.binary;

//Find ceiling of given number, ceiling is nothing but we have to find the smallest number which is >=target number

public class Ceil {

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
        return arr[start];
    }

  /*    Brute force 1st thought of implementation


        while(start<=end)
            {
                int mid=start + ((end-start)/2);
                if(arr[mid] == target)
                {
                    return arr[mid];
                }
                else if(arr[mid]<=target)
                {
                    for(int i=mid+1;i<arr.length;i++)
                    {
                        if(arr[i]>=target)
                            return arr[i];
                    }
                }
                else if(arr[mid]>=target)
                {
                     for(int i=mid-1;i>=0;i--)
                     {
                         if(arr[i]>=target)
                             return arr[i];
                     }
                }


            }

   */
    }
