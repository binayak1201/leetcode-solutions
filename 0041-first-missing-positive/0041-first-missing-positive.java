class Solution {
    public int firstMissingPositive(int[] nums) {
        if(nums.length==0)
        {
            return 1;
        }
    int i=0;
    while(i<nums.length)
    {
        if(nums[i]<=0 || nums[i]>nums.length)
        {
            i++;
        }
        else if(nums[nums[i]-1]==nums[i])
        {
            i++;
        }
        else
        {
          int temp;
            temp=nums[nums[i]-1];
            nums[nums[i]-1]=nums[i];
            nums[i]=temp;
            
     }
    }
    for(i=0;i<nums.length;i++)
    {
        if(nums[i]!=i+1)
            return i+1;
    }
        return nums[i-1]+1;
    }
}