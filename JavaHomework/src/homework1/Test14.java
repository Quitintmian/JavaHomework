package homework1;

import java.util.Arrays;

public class Test14 {
	public static void main(String[] args) {
		int[] Arr = {18,32,41,52,0,0,6,61,0,5,4,72,86,79,0,565,0} ;
		int notZeroCount = 0;
		for (int i = 0;i<Arr.length;i++) {
			if (Arr[i]!=0) {
				notZeroCount++;
			}
		}
		int [] newArr = new int[notZeroCount];
		for (int i = 0,k = 0; i < Arr.length; i++) {
			if (Arr[i]!=0) {
				newArr[k++]=Arr[i];
			}
		}
		Arrays.sort(newArr);
		for (int i = 0; i < newArr.length; i++) {
			System.out.print(" "+newArr[i]);
		}
	}
}
