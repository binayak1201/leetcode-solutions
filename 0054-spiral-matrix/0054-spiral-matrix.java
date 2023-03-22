class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> li=new ArrayList<Integer>();
      int r=matrix.length;
      int c=matrix[0].length;
        int i,k=0,l=0;
      while(k<r && l<c)
      {
          for(i=l;i<c;i++)
          {
              li.add(matrix[k][i]);
          }
          k++;
          for(i=k;i<r;i++)
          {
              li.add(matrix[i][c-1]);
          }
          c--;
          if(k<r)
          {
              for(i=c-1;i>=l;i--)
              {
                  li.add(matrix[r-1][i]);
              }
              r--;
          }
          if(l<c)
          {
              for(i=r-1;i>=k;i--)
              {
                  li.add(matrix[i][l]);
              }
              l++;
          }
      }
        return li;
    }
}