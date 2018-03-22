`4.1 Explain why this function is so slow, even for fairly small values of n (like n=45 or n=50). `

ANS: Because it run `fibonacci(n-1)` until its recursion complete before run `fibonacci(n-2)`. 
        There is too many work (pause `fibonacci(n-2)` and run `fibonacci(n-1)`),so, this's why
        this method is working so slow.    