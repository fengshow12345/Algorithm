package test163;

public class Test18_MergeSort {
	public static void main(String[] args) {
		int array[]={6,3,2,1,4,10,9,8,7,5};
		int b[]=new int[10];
		MergeSort(array, 0, 9, b);
		for(int i=0;i<10;i++){
			System.out.println(array[i]);
		}
	}

	//�鲢����ĺ��Ĺ���
	private static void MergeSort(int[] a,int left,int right,int[] temp) {
		// TODO Auto-generated method stub
		if(left<right){
			int mid=left+(right-left)/2;
			MergeSort(a, left, mid, temp);//�鲢����ʹ�������������
			MergeSort(a, mid+1, right, temp);//�鲢����ʹ���ұ���������
			MergeArray(a, left, mid, right, temp);//�ϲ�������������
		}
	}

	//�ϲ���������������
	private static void MergeArray(int[] a, int left, int mid, int right, int[] temp) {
		// TODO Auto-generated method stub
		int i=left,j=mid+1;
		int m=mid,n=right;
		int k=0;
		//��·�鲢
		while(i<=m&&j<=n){
			if (a[i]<=a[j]) {
				temp[k++]=a[i++];
			}
			else{
				temp[k++]=a[j++];
			}
		}
		//������������ʣ���Ԫ��
		while(i<=m){
			temp[k++]=a[i++];
		}
		while(j<=n){
			temp[k++]=a[j++];
		}
		//����ʱ�����п�����Ŀ��������
		for(i=0;i<k;i++){
			a[left+i]=temp[i];
		}
	}
}
