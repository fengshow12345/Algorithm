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
    //插入排序，小到大
	public static void InsertSort(int array[]) {
		int i,j;
		int n=array.length;
		int temp;
		for(i=1;i<n;i++){//从数组第二个元素开始循环，将数组中的元素插入
			temp=array[i];//设置数组中的第2个元素为第一次循环要插入的数据
			for(j=i-1;j>=0;j--){
				if(array[j]>temp){
					array[j+1]=array[j];//如果插入的元素小于第j个元素，就将第j个元素向后移动
				}
				else {
					break;
				}
			}
			array[j+1]=temp;//直到插入的元素不小于第j个元素，将temp插入搭配数组中
		}
	}
}
