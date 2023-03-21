class Solution {
    public boolean isHappy(int n) {
    HashSet<Integer>a=new HashSet();
       while(n!=1) 
       {
           int temp=n;
           n=0;
           while(temp>0)
           {
               n=n+(int)Math.pow((temp%10),2);
               temp=temp/10;
           }
               if(a.contains(n))
                   return false;
               else
                   a.add(n);
       }
        return true;
    }
}