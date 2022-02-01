// 2144. Minimum Cost of Buying Candies With Discount 
// https://leetcode.com/problems/minimum-cost-of-buying-candies-with-discount/
class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int sum=0;
        int length=cost.length;
        for(int i=length-1;i>=0;i--){
            while(i>1){
                sum=sum+cost[i--];
                sum=sum+cost[i--];
                i--;//skipping the 3rd one
            }
            while(i>=0){
                sum=sum+cost[i--];
            }
        }
        return sum;
        
    }
}