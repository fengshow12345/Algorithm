package test163;

import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//���θ���
		//�������������
		int x1[]=new int[n];//���½Ǻ�����
		int y1[]=new int[n];//���½�������
		int x2[]=new int[n];//���ϽǺ�����
		int y2[]=new int[n];//���Ͻ�������
		//�������
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
