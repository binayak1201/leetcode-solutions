class Solution {
    public int findJudge(int n, int[][] trust) {
        if(trust.length==1)
        {
            return trust[0][1];
        }
        int c[]=new int[n];
        int d[]=new int[n];
        for(int i=0;i<n;i++)
        {
            c[i]=0;
            d[i]=0;
        }
        for(int i=0;i<trust.length;i++)
        {
            c[trust[i][0]-1]++;
            d[trust[i][1]-1]++;
        }
        for(int i=0;i<n;i++)
        {
            if(c[i]==0 && d[i]==n-1)
                return i+1;
        }
        return -1;
    }
}

