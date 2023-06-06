class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int a=A.length;
        int arr[]=new int[a];
        int freq[]=new int[a+1];
        int c=0;
        for(int i=0;i<a;i++)
        {
            freq[A[i]]++;
            if(freq[A[i]]==2)
                c++;
            freq[B[i]]++;
            if(freq[B[i]]==2)
                c++;
                arr[i]=c;
            
        }
        return arr;
    }
}