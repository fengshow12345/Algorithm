package test163;

public class Test23_CountSort {
	public static void main(String[] args) {
		int A[]={2,5,3,0,2,3,0,3};
		sort(A);
		for(int i=0;i<A.length;i++){
			System.out.print(A[i]+" ");
		}
	}
	/**
	 * ���������Ԫ�ض��ǽ���0..k֮���
	 * 
	 * @param data
	 *            ����������
	 * @param k
	 *            ���Ԫ��
	 * @return ������
	 */
	public static int[] sort(int[] A) {
		int[] temp = new int[A.length];//��ʱ����
        int[] count = new int[A.length];
        for(int i = 0;i < A.length - 1;i++) {
            for(int j = i + 1;j < A.length;j++) {
                if(A[i] < A[j])
                    count[j]++;
                else
                    count[i]++;
            }
        }
        for(int i = 0;i < A.length;i++)
            temp[count[i]] = A[i];
        for(int i = 0;i < A.length;i++)
            A[i] = temp[i];
        return A;
	}
}