package homework1;

import java.util.Scanner;

public class Test12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = Integer.toBinaryString(n);
		int oneCount = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '1') {
				oneCount++;
			}
		}
		System.out.println(oneCount);
	}

}
