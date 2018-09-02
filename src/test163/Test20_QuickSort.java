package test163;

public class Test20_QuickSort {
	public static void main(String[] args) {
		int array[]={3,9,1,7,4,2};
		sort(array, 0, array.length-1);
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
	}
	//��������С����
    public static int divide(int[] a, int start, int end){  
        int base = a[end];//ÿ�ζ������ұߵ�Ԫ����Ϊ��׼ֵ  
        while(start < end){//startһ������end����˵����������ָ��ϲ�����ͬһλ�ã����Խ�������ѭ���� 
            while(start < end && a[start] <= base){                
                start++;//����߿�ʼ����������Ȼ�׼ֵС���ͼ���������  
            }//�����whileѭ������ʱ����˵����ǰ��a[start]��ֵ�Ȼ�׼ֵ��Ӧ���׼ֵ���н���  
            if(start < end){  //����  
                int temp = a[start];  
                a[start] = a[end];  
                a[end] = temp;//�����󣬴�ʱ���Ǹ���������ֵҲͬʱ��������ȷ��λ��(��׼ֵ�ұ�)������ұ�ҲҪͬʱ��ǰ�ƶ�һλ  
                end--;  
            }     
            while(start < end && a[end] >= base){//���ұ߿�ʼ����������Ȼ�׼ֵ�󣬾ͼ���������  
                end--;
            }//�����whileѭ������ʱ����˵����ǰ��a[end]��ֵ�Ȼ�׼ֵС��Ӧ���׼ֵ���н���  
            if(start < end){//����  
                int temp = a[start];  
                a[start] = a[end];  
                a[end] = temp;//�����󣬴�ʱ���Ǹ���������ֵҲͬʱ��������ȷ��λ��(��׼ֵ���)��������ҲҪͬʱ����ƶ�һλ  
                start++;  
            }         
        }
        return end;//���ﷵ��start����end�Կɣ���ʱ��start��end��Ϊ��׼ֵ���ڵ�λ��
    }  
  
    public static void sort(int[] a, int start, int end){  
        if(start > end){//���ֻ��һ��Ԫ�أ��Ͳ���������ȥ��  
            return;  
        }   
        else{//�����ֹһ��Ԫ�أ������������ߵݹ�������ȥ  
            int partition = divide(a, start, end);  
            sort(a, start, partition-1);  
            sort(a, partition+1, end);  
        }         
    }  
}
