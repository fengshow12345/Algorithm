package test163;

import java.util.Scanner;

public class Test9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//转向次数
		String s=sc.next();//转向字符串
		int turnNumb[]=new int[n];
		int sum=0;
		char direction='N';
		for(int i=0;i<n;i++){
			if(s.charAt(i)=='L'){
				turnNumb[i]=-1;
			}
			else turnNumb[i]=1;
		}
		for(int j=0;j<turnNumb.length;j++){
			sum=sum+turnNumb[j];
		}
		switch (sum%4) {
		case 0:
			direction='N';
			break;

        case 1:
        	direction='E';
			break;
        case 2:
        	direction='S';
			break;

        case 3:
        	direction='W';
			break;
        case -1:
        	direction='W';
			break;
        case -2:
        	direction='S';
			break;

        case -3:
        	direction='E';
			break;
		}
		System.out.println(direction);
	}
}
