package test163;

public class Test26_01Knapsack_1 {
	 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int weight = 10;
        int n = 3;
        int[] w = {3,4,5};
        int[] p = {4,5,6};
        System.out.println(getMaxweight(w, p, weight, n));
    }
     
    public static int getMaxweight(int[] w, int[] p, int weight, int n){
        int[][] value = new int[n+1][weight+1];
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=weight;j++){
                //当物品为i件重量为j时，如果第i件的重量(w[i-1])小于重量j时，c[i][j]为下列两种情况之一：
                //(1)物品i不放入背包中，所以c[i][j]为c[i-1][j]的值
                //(2)物品i放入背包中，则背包剩余重量为j-w[i-1],所以c[i][j]为c[i-1][j-w[i-1]]的值加上当前物品i的价值
                if(w[i-1]<=j){
                    value[i][j]=Math.max(value[i-1][j], value[i-1][j-w[i-1]]+p[i-1]);
                     
                }
            }
        }
        return value[n][weight];
    }
}
