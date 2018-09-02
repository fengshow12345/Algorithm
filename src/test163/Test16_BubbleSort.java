package test163;

public class Test16_BubbleSort {
	public static void main(String[] args) {
		int array[]={7,5,2,9,1,3};
		BubbleSort_3(array);
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
	}
	//Ã°ÅİÅÅĞò£¬Ğ¡µ½´ó
	private static void BubbleSort_3(int[] array) {
		// TODO Auto-generated method stub
		int temp;
		for(int i=0;i<array.length-1;i++){
			for(int j=0;j<array.length-1-i;j++){
				if(array[j]>array[j+1]){
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
	}
}