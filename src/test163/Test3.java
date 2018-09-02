package test163;

public class Test3 {
	public static void main(String[] args) {
        String s = "123456";
        for(int index=0;index<s.length();index++)//将字符串中的字符逐个按行输出
        {
            System.out.print(s.charAt(index));
        }
    }

}
