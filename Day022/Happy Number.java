class Solution {
     public boolean isHappy(int n) {
        int s=n;
        int f=n;
        
        do {
            s=square(s);
            f=square(square(f));
            
        }
        while(s!=f);
        if(s==1)
            return true;
        return false;


    }
    static int square(int n)
    {
        int sum=0;
        while(n!=0)
        {
            sum+=Math.pow((n%10),2);
            n=n/10;
        }
        return sum;
    }
}
