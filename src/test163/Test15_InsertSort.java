package test163;

public class Test15_InsertSort {
	public static void main(String[] args) {
		int array[]={7,6,2,3,1,9};
//		int array[]={3,1};
		InsertSort(array);
		for(int m=0;m<array.length;m++){
			System.out.println(array[m]);
		}
	}
    //��������С����
	public static void InsertSort(int array[]) {
		int i,j;
		int n=array.length;
		int temp;
		for(i=1;i<n;i++){//������ڶ���Ԫ�ؿ�ʼѭ�����������е�Ԫ�ز���
			temp=array[i];//���������еĵ�2��Ԫ��Ϊ��һ��ѭ��Ҫ���������
			for(j=i-1;j>=0;j--){
				if(array[j]>temp){
					array[j+1]=array[j];//��������Ԫ��С�ڵ�j��Ԫ�أ��ͽ���j��Ԫ������ƶ�
				}
				else {
					break;
				}
			}
			array[j+1]=temp;//ֱ�������Ԫ�ز�С�ڵ�j��Ԫ�أ���temp�������������
		}
	}
}
