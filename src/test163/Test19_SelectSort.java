package test163;

public class Test19_SelectSort {
	public static void main(String[] args) {
		int array[]={49,38,65,97,76,13,27,49};
		SelectSort(array);
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
	}
    //ѡ������С����
	private static void SelectSort(int[] array) {
		// TODO Auto-generated method stub
		if(array==null || array.length<=0){
			return;
		}//�������Ƿ��������Ҫ�����ж�
		
		for(int i=0;i<array.length;i++){
			int temp=array[i];
			int flag=i;//����ǰ�±궨��Ϊ��С�±�
			for(int j=i+1;j<array.length;j++){
				if(array[j]<temp){//array[j]<temp��С��������array[j]>temp�Ӵ�С����
					temp=array[j];
					flag=j;//�����С�ڵ�ǰ��Сֵ�Ĺؼ��ֽ��˹ؼ��ֵ��±긳ֵ��flag
				}//�õ���Сֵ�����±�
			}
			if(flag!=i){//�ж�i��Ԫ���Ƿ����С��i��
				array[flag]=array[i];
 				array[i]=temp;
			}
		}
	}
}
