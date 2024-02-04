package searching.linear;

//Given an array nums of integers, return how many of them contain an even number of digits.
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
public class EvenDigits_1295 {
    public static void main(String[] args) {
        int a =-123;
        String x = a+"";
        System.out.println(x.length());
    }
    public int findNumbers(int[] nums) {
        int evendigi = 0;
        //BruteForce Approach
           /*
        for(int number:nums)
        {
            int count =0;
            if(number==0)
            {
                count=1;
            }
            else if(number < 0)
            {
                number=number*-1;
            }
            while((number) > 0)
            {
                number=number/10;
                count ++;
            }
            if(count%2 ==0)
            {
                 evendigi++;
            }
        }
        return evendigi; */

        //Optimised Approach
        for(int number : nums)
        {
            int count =0;
            if(number==0)
            {
                count=1;
            }
            else if(number < 0)
            {
                number=number*-1;
            }
            else{
                count = (int) Math.log10(number)+1;
            }
            if(count%2 ==0)
            {
                evendigi++;
            }
        }
        return evendigi;

        //Using String
        // for(int number : nums)
        // {
        //     String x = number+"";
        //     int count = x.length();
        //     if(number < 0)
        //     {
        //         count =count -1;
        //     }
        //     if(count%2 ==0)
        //     {
        //          evendigi++;
        //     }
        // }
        // return evendigi;

    }
}
