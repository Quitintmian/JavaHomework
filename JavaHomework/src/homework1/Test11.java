package homework1;

public class Test11 {
	public static void main(String[] args) {
		int [] arr ={2,3,1,0,2,5,3};
		int [] numCount = new int[10];
		for (int i = 0; i < arr.length; i++) {
			numCount[arr[i]]++;
		}
		for (int i = 0; i < arr.length; i++) {
			if (numCount[arr[i]] == 2) {
				System.out.println(arr[i]);
				break;
			}
		}
	}
}
