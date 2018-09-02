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
	 * 输入数组的元素都是介于0..k之间的
	 * 
	 * @param data
	 *            待排序数组
	 * @param k
	 *            最大元素
	 * @return 排序结果
	 */
	public static int[] sort(int[] A) {
		int[] temp = new int[A.length];//临时数组
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