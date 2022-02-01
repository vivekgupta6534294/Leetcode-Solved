// https://leetcode.com/contest/weekly-contest-277/problems/rearrange-array-elements-by-sign/
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int res[]=new int[nums.length];
        int pos=0,neg=1;
        for(int ele: nums){
            if(ele>0){
                res[pos]=ele;
                pos=pos+2;;
            }else{
                res[neg]=ele;
                neg+=2;
            }
        }
        return res;
        
    }
}