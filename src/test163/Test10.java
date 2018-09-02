package test163;

import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//矩形个数
		//定义坐标的数组
		int x1[]=new int[n];//左下角横坐标
		int y1[]=new int[n];//左下角纵坐标
		int x2[]=new int[n];//右上角横坐标
		int y2[]=new int[n];//右上角纵坐标
		//添加坐标
		for(int i=0;i<n;i++){
			x1[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			y1[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			x2[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			y2[i]=sc.nextInt();
		}
		
	}
}
