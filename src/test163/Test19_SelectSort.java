package test163;

public class Test19_SelectSort {
	public static void main(String[] args) {
		int array[]={49,38,65,97,76,13,27,49};
		SelectSort(array);
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
	}
    //选择排序，小到大
	private static void SelectSort(int[] array) {
		// TODO Auto-generated method stub
		if(array==null || array.length<=0){
			return;
		}//对数组是否符合排序要求做判断
		
		for(int i=0;i<array.length;i++){
			int temp=array[i];
			int flag=i;//将当前下标定义为最小下标
			for(int j=i+1;j<array.length;j++){
				if(array[j]<temp){//array[j]<temp从小到大排序，array[j]>temp从大到小排序
					temp=array[j];
					flag=j;//如果有小于当前最小值的关键字将此关键字的下标赋值给flag
				}//拿到最小值及其下标
			}
			if(flag!=i){//判断i后元素是否存在小于i的
				array[flag]=array[i];
 				array[i]=temp;
			}
		}
	}
}
