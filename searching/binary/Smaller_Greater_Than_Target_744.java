package searching.binary;
//744. Find Smallest Letter Greater Than Target
/*You are given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.

Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.

https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
 */
public class Smaller_Greater_Than_Target_744 {


    public static void main(String[] args) {

        char[] arr={'c','f','j'};
        System.out.println(ceilNumber(arr,'c'));

    }

    public static char ceilNumber(char[] arr, char target) {
    int start=0;
    int end = arr.length-1;
        while(start<=end)
    {
        int mid = start + ((end-start)/2);
        if(target>=arr[mid])
        {
            start=mid+1;
        }
        else if(target<arr[mid])
        {
            end=mid-1;
        }
    }
        return arr[start % arr.length];


}
}
