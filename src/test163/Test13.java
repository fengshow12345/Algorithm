package test163;

import java.util.Scanner;

public class Test13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int count=1;
		if(n==2){
		System.out.println(1);
		}
		else{
			for(int i=3;i<=n;i++){
				count=count*i;
			}
			System.out.println(count);
		}
	}
}
