class Solution {
    public boolean isPerfectSquare(long n) {
        long l=1,r=n,mid,c=0;
        while(l<=r)
        {
            mid=(l+r)/2;
            if(mid*mid==n)
            {
                c=1;
                break;
            }
            else if(mid*mid>n)
            {
                r=mid-1;
            }
            else if(mid*mid<n)
            {
                l=mid+1;
            }
        }
        if(c==1)
            return true;
        else 
            return false;
      
        
    }
}