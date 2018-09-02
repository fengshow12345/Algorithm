package test163;

import java.util.Scanner;


public class Test14_Recursion {
	public static void main(String[] args) {
		int a[]={1,2,3,4,5};
		int s=0,e=4;
		int sum=Recursion(a,s,e);
		System.out.println(sum);
	}
	
	public static int Recursion(int a[],int start,int end){
	    if(start==end)
	    return a[start];
	    
	    return a[start]+Recursion(a,start+1,end);
	}
	
}