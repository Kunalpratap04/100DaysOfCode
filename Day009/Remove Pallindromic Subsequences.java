class Solution {
    public int removePalindromeSub(String s) {
       if(isPallindrome(s))
       {
           return 1;
       }
        return 2;
    }
   public static boolean checkPalindrome(String str, int s, int e) 
    { 
        if (s == e)    
            return true;  
         
        if ((str.charAt(s)) != (str.charAt(e))) 
            return false;   
         
         
        if (s < e + 1) 
            return checkPalindrome(str, s + 1, e - 1);   
        return true; 
    }   
  public  static boolean isPallindrome(String str) 
    { 
        int n = str.length();   
    
        if (n == 0) 
            return true;   
        return checkPalindrome(str, 0, n - 1); 
    }   
   
}
