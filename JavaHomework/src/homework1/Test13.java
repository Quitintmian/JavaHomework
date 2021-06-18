package homework1;

public class Test13 {
	public static void main(String[] args) {
		int [] arr ={5, 2, 4, 3, 3, 2, 5};
		int [] numCount = new int[10];
		for (int i = 0; i < arr.length; i++) {
			numCount[arr[i]]++;
		}
		for (int i = 0; i < numCount.length; i++) {
			if (numCount[i] == 1) {
				System.out.println(i);
				break;
			}
		}
	}

}
