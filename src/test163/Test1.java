package test163;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int coinCount = in.nextInt();
            StringBuilder sb = new StringBuilder();
            while (coinCount > 0) {
                if (coinCount % 2 == 0) {
                    //Å¼Êý
                    coinCount = (coinCount - 2) / 2;
                    sb.append("2");
                } else {
                    //ÆæÊý
                    coinCount = (coinCount - 1) / 2;
                    sb.append("1");
                }
            }
            System.out.println(sb.reverse().toString());
        }
        in.close();
    }

}
