package code100days.Recursion;
 import java.util.*;
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr[]= {'a','b','c'};
		
		rev(arr,new ArrayList<Character>(),arr.length-1).toArray();

	}
   static ArrayList<Character> rev(char s[],ArrayList<Character> arr,int pos)
   {
	   if(pos==-1)
	   {
		   return arr;
	   }
	   arr.add(s[pos]);
	   return rev(s, arr, pos-1);
   }
   
}
