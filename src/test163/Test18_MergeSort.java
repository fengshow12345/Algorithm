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

	//归并排序的核心工作
	private static void MergeSort(int[] a,int left,int right,int[] temp) {
		// TODO Auto-generated method stub
		if(left<right){
			int mid=left+(right-left)/2;
			MergeSort(a, left, mid, temp);//归并排序，使得左边序列有序
			MergeSort(a, mid+1, right, temp);//归并排序，使得右边序列有序
			MergeArray(a, left, mid, right, temp);//合并两个有序序列
		}
	}

	//合并两个有序子数组
	private static void MergeArray(int[] a, int left, int mid, int right, int[] temp) {
		// TODO Auto-generated method stub
		int i=left,j=mid+1;
		int m=mid,n=right;
		int k=0;
		//二路归并
		while(i<=m&&j<=n){
			if (a[i]<=a[j]) {
				temp[k++]=a[i++];
			}
			else{
				temp[k++]=a[j++];
			}
		}
		//处理子数组中剩余的元素
		while(i<=m){
			temp[k++]=a[i++];
		}
		while(j<=n){
			temp[k++]=a[j++];
		}
		//从临时数组中拷贝到目标数组中
		for(i=0;i<k;i++){
			a[left+i]=temp[i];
		}
	}
}
