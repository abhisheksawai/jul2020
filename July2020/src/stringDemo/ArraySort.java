package stringDemo;

import java.util.Arrays;

public class ArraySort {
	
	public static void main(String[] args) {
		
		int a[] = {210,340,40,50,60};
		
		System.out.println("before sort");
		for(int i=0 ; i<a.length ; i++)
		{
			System.out.println(a[i]);	
		}
		
		Arrays.sort(a);  // srorint array
		
		System.out.println("after sort");
		for(int i=0 ; i<a.length ; i++)
		{
			System.out.println(a[i]);	
		}
		
	}
	

}
