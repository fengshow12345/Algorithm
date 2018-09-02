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
		for(int i=num-1;i>=0;i--){//从面值更大的开始选择
			int C=Math.min(money/Value[i], Count[i]);
			//选取该面值的钱币的数量，若持有的数量不够完全支付，则全部选择；
			//如持有的数量的总面值超过需支付的金额，则只选取部分数量该面值的钱币。
			money=money-C*Value[i];//选取钱币后，获取剩下未支付部分的金额。
			result+=C;//累加取出钱币的数量。
		}
		if(money>0){//若持有的钱币不能完整支付所需的金额，将result设为-1。
			result=-1;
		}
		return result;
	}
}
