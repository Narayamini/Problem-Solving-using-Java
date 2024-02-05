//Given a sorted array of distinct integers and a target value, return the index if the
// target is found. If not, return the index where it would be if it were inserted in order.
//
//You must write an algorithm with O(log n) runtime complexity.
//https://leetcode.com/problems/search-insert-position/description/
package searching.binary;

public class InsertPosition_35 {
        public int searchInsert(int[] nums, int target) {
            int start =0;
            int end=nums.length-1;
            int mid = start+((end-start)/2);
            while(start<=end)
            {
                mid = start+((end-start)/2);
                if(target == nums[mid])
                {
                    return mid;
                } else if (target>nums[mid]) {

                    start=mid+1;
                }
                else {

                    end=mid-1;
                }
            }
            return start;

        }}