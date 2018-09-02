package test163;

import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String strs[] = new String[n];
		for(int i=0;i < n; i++) {
			strs[i] = sc.next();
		}
		for(int i=0;i < n; i++) {
			System.out.println(change(strs[i]));
		}
		sc.close();
	}
	public static String change(String s) {
		if( s.matches("R\\d+C\\d+")) {
			return changeToBsc(s);
		}
		return changeToRC(s);
	}
	public static String changeToBsc(String s) {
		int col=0,row=0;
		boolean isRow = true;
		for(char c : s.toCharArray()) {
			if( c <= '9') {
				if( isRow )
					row = row * 10 + c - '0';
				else
					col = col * 10 + c - '0';
			} else {
				isRow = c == 'R';
			}
		}
		String col_s = "";
		while( col > 0) {
			int t = (col-1) % 26 + 1;
			col_s = (char)(t + 'A' -1) + col_s;
			col = (col-1) / 26;
		}
		return col_s+row;
	}
	public static String changeToRC(String s) {
		int col=0,row=0;
		for(char c : s.toCharArray()) {
			if( c>= 'A') {
				col = col * 26 + c - 'A' + 1;
			} else {
				row = row * 10 + c - '0';
			}
		}
		return "R"+row+"C"+col;
	}
}