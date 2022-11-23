class Solution {
    public int maxProfit(int[] p) {
             if(p.length==1)
            return 0;
         int minprice=p[0];
        int maxprofit=0;
        for(int i=0;i<p.length;i++){
            if(p[i]<minprice)
                minprice=p[i];
            maxprofit=Math.max(p[i]-minprice,maxprofit);
        }
        return maxprofit; 
    }
}
