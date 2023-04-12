class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int l=nums.length/2;
        return nums[l];
    }
}