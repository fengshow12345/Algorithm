package test163;

public class Test24_CountSort2 {
	private static int[] countSort(int[] array,int k){
        int[] C=new int[k+1];//����C����
        int length=array.length,sum=0;//��ȡA�����С���ڹ���B����  
        int[] B=new int[length];//����B����
        for(int i=0;i<length;i++)
        {
            C[array[i]]+=1;// ͳ��A�и�Ԫ�ظ���������C����
        }
        for(int i=0;i<k+1;i++)//�ۼ�C���飬���Ԫ�ص���λ���޸�C����
        {
            sum+=C[i];
            C[i]=sum;    
        }
        
        //
        for(int i=0;i<C.length;i++){
        	System.out.print(C[i]+" ");
        }
        System.out.println();
        //
        
        for(int i= length-1;i>=0;i--)//����A���飬����B����
        {
            
            B[C[array[i]]-1]=array[i];//��A�и�Ԫ�طŵ����������B��ָ����λ��
            C[array[i]]--;//��C�и�Ԫ��-1����ʾ��Ԫ�������ź����(��������һ��ͬ����С��Ԫ��)
            
        }
        return B;//������õ����鷵�أ��������
        
    }
    public static void main(String[] args)
    {
        int[] A=new int[]{2,5,3,0,2,3,0,3};
        int[] B=countSort(A, 5);
        for(int i=0;i<A.length;i++)
        {
//            System.out.println((i+1)+"th:"+B[i]);
        	System.out.print(B[i]+" ");
        }
    }  
}
