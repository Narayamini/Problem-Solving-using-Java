package searching.linear;
//You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the ith customer has in the jth bank. Return the wealth that the richest customer has.
//A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.
//https://leetcode.com/problems/richest-customer-wealth/description/
public class CustomerWealth_1672 {
        public int maximumWealth(int[][] accounts) {

            int max = 0;
            for(int[] row:accounts)
            {
                int sum=0;
                for(int column : row)
                {
                    sum = sum + column;
                }
                if(sum>max)
                {
                    max=sum;
                }
            }
            return max;
        }
    }
