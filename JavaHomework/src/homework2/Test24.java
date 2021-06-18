package homework2;

import java.util.Scanner;

public class Test24 {
	public static void main(String[] args) {
		String[] box = new String[100];
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i <=n; i++) {
			if ((i%3==0)&&(i%5==0)) {
				box[i] = "FizzBuzz";
			}else if (i%3==0) {
				box[i] = "Fizz";
			}else if (i%5==0) {
				box[i] = "Buzz";
			}else {
				box[i] = Integer.toString(i);
			}
		}
		for (int i = 0; (i < box.length)&&(box[i]!=null); i++) {
			System.out.println(box[i]);
		}
	}
}
