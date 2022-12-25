class Solution {
    public void moveZeroes(int[] nums) {
        int c=0,j=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            c++;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                nums[j]=nums[i];
                j++;
            }
        }
        if(c>0)
        {
        for(int i=nums.length-1;i>=0;i--)
        {
            nums[i]=0;
            c--;
            if(c==0)
            break;
        }
        }

    }
}
