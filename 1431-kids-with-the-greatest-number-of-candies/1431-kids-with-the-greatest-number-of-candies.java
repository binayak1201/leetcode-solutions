class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> l=new ArrayList<Boolean>();
        int max=candies[0];
        for(int i=0;i<candies.length;i++)
        {
            if(max<candies[i])
            {
                max=candies[i];
            }
        }
        for(int i=0;i<candies.length;i++)
        {
            if(candies[i]+extraCandies>=max)
                l.add(true);
            else
                l.add(false);
        }
        return l;
    }
}