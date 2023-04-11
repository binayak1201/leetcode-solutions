class Solution {
    public int hIndex(int[] citations) {
        int max=citations.length;
        for(int i=0;i<citations.length;i++)
        {
            if(max-i<=citations[i])
            {
                return max-i;
            }
        }
        return 0;
    }
}