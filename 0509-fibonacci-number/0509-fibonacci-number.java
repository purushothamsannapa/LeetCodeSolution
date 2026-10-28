class Solution {
    public int fib(int n) {
        if(n < 2)
        {
            return n;
        }

        return fib(n-1)+fib(n-2);
    }
    // public int fibo(int n)
    // {
    //     if(n >2)
    //     {
    //         return n;
    //     }

    //     return fibo(n-1)+fibo(n-2);
    // }
}