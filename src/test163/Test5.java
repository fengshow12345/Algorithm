package test163;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		System.out.println("请输入：");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		System.out.println("你限定的n为："+n+",k为： "+k);
		
		int count=0;
		
		for(int x=n;x>=1;x--){
			for(int y=n;y>=1;y--){
				int z=x%y;
				if(z>=k){
					count++;
				}
			}
		}
		
		System.out.println("符合要求的整数对有"+count+"个。");
	}
}
