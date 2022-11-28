class Solution {
    public String toLowerCase(String s) {
        String str="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='A' && s.charAt(i)<='Z')
            {
                str+=(char)(s.charAt(i)+32);
            }
            else{
                str+=s.charAt(i);
            }
        }
        return str;
    }
}
