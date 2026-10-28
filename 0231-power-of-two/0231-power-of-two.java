class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0)
        {
        return false;
        }
        return powerOf(n,0);
    }
    public boolean powerOf(int n,int i)
    {
       long currentPower=(long)Math.pow(2,i);
       if(currentPower == n)
       {
        return true;
       }
       if(currentPower > n)
       {
        return false;
       }
        return powerOf(n,i+1);
    }
}