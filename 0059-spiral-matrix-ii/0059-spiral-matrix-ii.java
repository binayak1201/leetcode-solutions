class Solution {
    public int[][] generateMatrix(int n) {
        int matrix[][]=new int[n][n]; 
      int r=n;
      int c=n;
      int x=1; 
      int i,k=0,l=0;
      while(k<r && l<c)
      {
          for(i=l;i<c;i++)
          {
              matrix[k][i]=x;
              x++;
          }
          k++;
          for(i=k;i<r;i++)
          {
              matrix[i][c-1]=x;
              x++;
          }
          c--;
          if(k<r)
          {
              for(i=c-1;i>=l;i--)
              {
                  matrix[r-1][i]=x;
                  x++;
              }
              r--;
          }
          if(l<c)
          {
              for(i=r-1;i>=k;i--)
              {
                  matrix[i][l]=x;
                  x++;
              }
              l++;
          }
      }
        return matrix;
    }
}