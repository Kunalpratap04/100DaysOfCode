package code100days.Recursion;

import java.util.ArrayList;

public class ReturnArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {55,4,55,6,77,9};
		   int t=55;
		   //
		   ArrayList<Integer> list=new ArrayList<Integer>();
		//System.out.println(search(arr, t, 0, new ArrayList<Integer>()));
		System.out.println(search1(arr, t, 0));

	}
	static ArrayList<Integer> search(int arr[],int t,int pos,ArrayList<Integer> list)
	{
		if(pos==arr.length)
		{
			return list;
		}
		if(arr[pos]==t)
		{
			list.add(pos);
		}
		return search(arr, t, pos+1, list);
	}
	
	static ArrayList<Integer> search1(int arr[],int t,int pos)
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		if(pos==arr.length)
		{
			return list;
		}
		if(arr[pos]==t)
		{
			list.add(pos);
		}
		
		ArrayList<Integer> list2 = search1(arr, t, pos+1);
		list.addAll(list2);
		return list;
	}
}
