package test163;

import sun.net.www.content.audio.wav;

public class Test25_Greedy_2_Bag {
	public static void main(String[] args) {
		int M=50;
		int N=4;
		float W[]={0,10,30,20,5};
		float V[]={0,200,400,100,10};
		float x[]=new float[N+1];
		knapsack(M,N,V,W,x);
		System.out.println("ѡ��װ�����Ʒ������");
		for(int i=0;i<=N;i++){
			System.out.println("["+i+"]:"+x[i]);
		}
	}

	private static void knapsack(int M, int N, float[] V, float[] W, float[] x) {
		// TODO Auto-generated method stub
		int i;
		//��Ʒ������װ��
		for(i=1;i<=N;i++){
			if(W[i]>M){
				break;
			}
			else{
				x[i]=1;
				M-=W[i];
			}
		}
		//��Ʒ���ֱ�װ��
		if(i<=N){
			x[i]=M/W[i];
		}
	}
}
