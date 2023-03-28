class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> li=new ArrayList<Integer>(); 
        List<List<Integer>> dp=new ArrayList<>();
        if(nums==null||nums.length==0)
        {
            return li;
        }
        Arrays.sort(nums);
        for(int num:nums)
            dp.add(new ArrayList<>());
        for(int i=0;i<nums.length;i++)
        {
            List<Integer> max=new ArrayList<>();
            for(int k=0;k<i;k++)
            {
                if(nums[i]%nums[k]==0&& max.size()<dp.get(k).size())
                    max=dp.get(k);
            }
            dp.get(i).addAll(max);
            dp.get(i).add(nums[i]);
        }
        for(int i=0;i<dp.size();i++)
        {
            if(li.size()<dp.get(i).size())
                li=dp.get(i);
        }
        return li;
    } 
}