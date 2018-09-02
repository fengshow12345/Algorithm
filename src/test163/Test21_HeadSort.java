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
		for(int i=array.length/2-1;i>=0;i--){// ����һ���󶥶�
			adjustHead(array,i,array.length-1);
		}
		for(int i=array.length-1;i>=0;i--){
			int temp=array[0];
			array[0]=array[i];//��������Ҷ�ӽڵ������Ѷ�
			array[i]=temp;//���Ѷ������Ԫ�������������λ��
			adjustHead(array, 0, i-1);// ��a��ǰi-1����¼���µ���Ϊ�󶥶�
		}
		
	}

	private static void adjustHead(int[] array, int i, int len) {
		// TODO Auto-generated method stub
		int temp,j;
		temp=array[i];
		for(j=2*i;j<len;j*=2){//�عؼ��ֽϴ�ĺ��ӽ������ɸѡ
			if(j<len&&array[j]<array[j+1]){//array[j]Ϊarray[i]��������array[j+1]Ϊarray[i]������
				++j;//jΪ�ؼ����нϴ��¼���±�
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
