package test163;
//��������
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
			//int k=parition(array,left,right);//����
			int k=parition_1(array,left,right);
			quicksort(array, left, k-1);
			quicksort(array, k+1, right);
		}
	}

	private static int parition_1(int[] array, int left, int right) {
		// TODO Auto-generated method stub
		 int key=array[left];
	        while(left<right){
	            while(array[right]>=key&&right>left){//�Ӻ�벿����ǰɨ��
	                right--;
	            }
	            array[left]=array[right];
	            while(array[left]<=key&&right>left){//��ǰ�벿�����ɨ��
	                left++;
	            }
	            array[right]=array[left];
	        }
	        array[right]=key;//��key�����µ�right��λ��s	        
	        return right;//key��λ��
	        
	}

	//��һ��������ĳһ��׼�㻮��Ϊ����������
	private static int parition(int[] array, int left, int right) {
		// TODO Auto-generated method stub
		int key=array[right];
		int i=left-1;
		int temp;
		//��ʼ�Ի�׼��Ϊ��׼�ָ�����
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
		//����׼��ŵ����ʵ�λ��
		temp=array[i+1];
		array[i+1]=array[right];
		array[right]=temp;
		
		return i+1;
	}
	
	

}
