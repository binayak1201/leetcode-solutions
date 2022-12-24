class Solution {
    public int removeElement(int[] nums, int val) {
        int pos=0,c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==val)
            {
                pos=i;
                c++;
            for(int j=pos;j<nums.length-1;j++)
            {
                nums[j]=nums[j+1];
            }
            nums[nums.length-1]=95;
            pos=0;
            i=i-1;
            }
          
        }
        return nums.length-c;
    }
}
