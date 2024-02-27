package searching.binary;
//https://leetcode.com/problems/split-array-largest-sum/description/
public class Split_Array_Largest_Sum_410 {

    public static void main(String[] args) {
        int[] arr= {6,7,9,0,1,2,3,4,5};
////        int[] arr={3,4,5,6,7,1,2};
//        int[] arr= {1,3
        System.out.println(splitArray(arr,2));


    }
    public static int splitArray(int[] nums, int k) {
        int start=0;
        int end=0;
        for(int i=0;i<nums.length;i++)
        {
            start=Math.max(start,nums[i]);
            end=end+nums[i];
        }

        //binary search
        while(start<end)
        {
            int mid=start+((end-start)/2);
            //calculate how many pieces we can divide
            int sum=0;
            int pieces=1;
            for(int num: nums)
            {
                if(sum+num>mid)
                {
                    sum=num;
                    pieces++;
                }
                else{
                    sum=sum+num;
                }
            }
            if(pieces>k)
            {
                start=mid+1;
            }
            else
            {
                end=mid;
            }
        }
        return end;

    }
}
