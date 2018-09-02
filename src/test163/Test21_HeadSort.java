package test163;

public class Test21_HeadSort {
	public static void main(String[] args) {
		int array[]={16,7,3,20,17,8};
		HeadSort(array);
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
	}

	private static void HeadSort(int[] array) {
		// TODO Auto-generated method stub
		for(int i=array.length/2-1;i>=0;i--){// 构建一个大顶堆
			adjustHead(array,i,array.length-1);
		}
		for(int i=array.length-1;i>=0;i--){
			int temp=array[0];
			array[0]=array[i];//将堆最后的叶子节点排至堆顶
			array[i]=temp;//将堆顶的最大元素排至数组最后位置
			adjustHead(array, 0, i-1);// 将a中前i-1个记录重新调整为大顶堆
		}
		
	}

	private static void adjustHead(int[] array, int i, int len) {
		// TODO Auto-generated method stub
		int temp,j;
		temp=array[i];
		for(j=2*i;j<len;j*=2){//沿关键字较大的孩子结点向下筛选
			if(j<len&&array[j]<array[j+1]){//array[j]为array[i]左子树，array[j+1]为array[i]右子树
				++j;//j为关键字中较大记录的下标
			}
			if(temp>=array[j]){
				break;
			}
			array[i]=array[j];
			i=j;
		}
		array[i]=temp;
	}
}
