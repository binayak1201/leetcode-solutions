class Solution {
    public int trailingZeroes(int n) {
        int no=0;
        while(n>0)
        {
        no=no+n/5;
        if(n/5>=5)
        {
            n=n/5;
        }
        else
            break;
        }
        return no; 
    }
}
