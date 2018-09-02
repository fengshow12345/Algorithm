package test163;

import java.util.Scanner;

public class Test7 {
	public static void main(String args[]){
	      Scanner sc=new Scanner(System.in);
	      int l=sc.nextInt();
	      int r=sc.nextInt();
	      int result=0;
	      for(int i=l;i<=r;i++){
	    	  switch (i%3) {
			case 1:
				break;

			case 2: result++;
				break;
				
			case 0: result++;
			break;
				
			}
	      }
	      System.out.println(result);
	    }
}
