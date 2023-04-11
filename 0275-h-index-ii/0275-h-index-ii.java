class Solution {
    public int hIndex(int[] citations) {
        int n=citations.length;
        int ans=0;
        int l=0,h=citations.length;
        while(l<h)
        {
            int mid=l+(h-l)/2;
            if(n-mid<=citations[mid])
            {
                ans=Math.max(n-mid,ans);
                h=mid;
            }
            else
            {
                l=mid+1;
            }
        }
        return ans;
    }
}