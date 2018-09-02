package test163;
public class Test27_01Knapsack_2 {
	public static void main(String[] args) {
//		int[] weight={3,5,2,6,4};//��Ʒ����
//		int[] val={4,4,3,5,3};//��Ʒ��ֵ
		int[] weight={2,1,3,2,4,5,3,1};
		int[] val={13,10,24,15,28,33,20,8};
		int m=12;//��������
		int n=val.length;//��Ʒ����
		int[][] f=new int[n+1][m+1];//ǰi����Ʒ��װ������Ϊi�ı����е�����ֵ
		int[][] path=new int[n+1][m+1];
		//��ʼ����һ�к͵�һ��
		for(int i=0;i<f.length;i++){
			f[i][0]=0;
		}
		for(int i=0;i<f[0].length;i++){
			f[0][i]=0;
		}
		//ͨ����ʽ��������
		for(int i=1;i<f.length;i++){
			for(int j=1;j<f[0].length;j++){
				if(weight[i-1]>j){
					f[i][j]=f[i-1][j];
				}
				else{  
                    if(f[i-1][j]<f[i-1][j-weight[i-1]]+val[i-1]){  
                        f[i][j] = f[i-1][j-weight[i-1]]+val[i-1];  
                        path[i][j] = 1;  
                    }else{  
                        f[i][j] = f[i-1][j];  
                    }  
                    //f[i][j] = Math.max(f[i-1][j], f[i-1][j-weight[i-1]]+val[i-1]);  
                }  
			}
		}
		for(int i=0;i<f.length;i++){  
            for(int j=0;j<f[0].length;j++){  
                System.out.print(f[i][j]+" ");  
            }  
            System.out.println();  
        }
		int i=f.length-1;  
        int j=f[0].length-1;  
        while(i>0&&j>0){  
            if(path[i][j] == 1){  
                System.out.print("��"+i+"����Ʒװ�� ");  
                j -= weight[i-1];  
            }  
            i--;  
        }  
	}
}
