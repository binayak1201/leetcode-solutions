class Solution {
    public int pivotIndex(int[] nums) {
       int sum=0,leftsum=0,pos=0;
       for(int i=0;i<nums.length;i++)
       {
           sum+=nums[i];
       } 
       for(int i=0;i<nums.length;i++)
       {
           leftsum+=nums[i];
           sum=sum-nums[i];
           if(leftsum-nums[i]==sum)
           {
               leftsum=leftsum-nums[i];
               pos=i;
               if(leftsum==sum)
               return pos;
           }
       }
       return -1;
    }
}
