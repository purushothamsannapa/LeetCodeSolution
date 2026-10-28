class Solution {
    public void reverseString(char[] s) {
        char[] rser=rev(s);
        for(int i=0;i<s.length;i++)
        {
            s[i]= rser[i];
        }
    }
    char[] rev(char[] s)
    {
        if (s == null || s.length == 0) 
        {
            return new char[0];
        }
        char[] ch = new char[s.length];
        int j=0;
        for(int i=s.length-1;i>=0;i--)
        {
            ch[j]=s[i];
            j++;
        }
        return ch;
    }
}