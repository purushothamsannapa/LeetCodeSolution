class Solution {
    public void reverseString(char[] s) {
        reversHelper(s,0,s.length-1);
    }
    public void reversHelper(char[] c,int s,int e)
    {
        if(s>=e)
        {
            return;
        }

        char temp=c[s];
        c[s]=c[e];
        c[e]=temp;

        reversHelper(c,s+1,e-1);
    }
}