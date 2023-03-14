class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> map=new HashMap();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++)
        {
            int t=target-nums[i];
            if(map.containsKey(t)&&map.get(t)!=i)
                return new int[]{i,map.get(t)};
        }
        return new int[]{};
    }
}