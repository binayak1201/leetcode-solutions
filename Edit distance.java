class Solution {
    public int minDistance(String w1, String w2) {
        char []str1=w1.toCharArray();
        char []str2=w2.toCharArray();
        int d[][]=new int[str1.length+1][str2.length+1];
        int j,i,max=0,c=0;
        for(i=0;i<d[0].length;i++)
        {
            d[0][i]=c;
            c++;
        }
        c=0;
        for(i=0;i<d.length;i++)
        {
            d[i][0]=c;
            c++;
        }
        for(i=1;i<d.length;i++)
        {
            for(j=1;j<d[i].length;j++)
            {
                if(str1[i-1]==str2[j-1])
                    d[i][j]=d[i-1][j-1];
                else
                    d[i][j]=Math.min((Math.min(d[i][j-1],d[i-1][j])),d[i-1][j-1])+1;
                   
            }
        }
        return d[str1.length][str2.length];
            
    }
}
