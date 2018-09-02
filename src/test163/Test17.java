package test163;
//快速排序
public class Test17 {
	public static void main(String[] args) {
		int array[]={9,4,5,2,1,3,7,8,6};
		quicksort(array,0,8);
		for(int i=0;i<9;i++){
			System.out.println(array[i]);
		}
	}

	private static void quicksort(int[] array,int left,int right) {
		// TODO Auto-generated method stub
		if(left<right){
			//int k=parition(array,left,right);//划分
			int k=parition_1(array,left,right);
			quicksort(array, left, k-1);
			quicksort(array, k+1, right);
		}
	}

	private static int parition_1(int[] array, int left, int right) {
		// TODO Auto-generated method stub
		 int key=array[left];
	        while(left<right){
	            while(array[right]>=key&&right>left){//从后半部分向前扫描
	                right--;
	            }
	            array[left]=array[right];
	            while(array[left]<=key&&right>left){//从前半部分向后扫描
	                left++;
	            }
	            array[right]=array[left];
	        }
	        array[right]=key;//将key换到新的right的位置s	        
	        return right;//key的位置
	        
	}

	//将一个数组以某一基准点划分为两个子数组
	private static int parition(int[] array, int left, int right) {
		// TODO Auto-generated method stub
		int key=array[right];
		int i=left-1;
		int temp;
		//开始以基准点为标准分割序列
		for(int j=left;j<right;j++){
			if(array[j]<key){
				temp=array[i];
				array[j]=array[i];
				array[i]=temp;
			}
			else{
				break;
			}
		}
		//将基准点放到合适的位置
		temp=array[i+1];
		array[i+1]=array[right];
		array[right]=temp;
		
		return i+1;
	}
	
	

}
