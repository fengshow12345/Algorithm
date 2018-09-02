package test163;

import java.util.Scanner;

public class Test25_Greedy_1_Coin {	
	public static void main(String[] args) {
		
		int Count[]={3,0,2,1,0,3,5};
		int Value[]={1,2,5,10,20,50,100};
		
		Scanner sc=new Scanner(System.in);
		int money=sc.nextInt();
		int num=Count.length;
		int result=Solve(money, Count, Value, num);
		if(result!=-1){
			System.out.println(result);
		}
		else {
			System.out.println("No!");
		}
	}

	private static int Solve(int money,int[] Count,int[] Value, int num) {
		// TODO Auto-generated method stub
		int result=0;
		for(int i=num-1;i>=0;i--){//����ֵ����Ŀ�ʼѡ��
			int C=Math.min(money/Value[i], Count[i]);
			//ѡȡ����ֵ��Ǯ�ҵ������������е�����������ȫ֧������ȫ��ѡ��
			//����е�����������ֵ������֧���Ľ���ֻѡȡ������������ֵ��Ǯ�ҡ�
			money=money-C*Value[i];//ѡȡǮ�Һ󣬻�ȡʣ��δ֧�����ֵĽ�
			result+=C;//�ۼ�ȡ��Ǯ�ҵ�������
		}
		if(money>0){//�����е�Ǯ�Ҳ�������֧������Ľ���result��Ϊ-1��
			result=-1;
		}
		return result;
	}
}
