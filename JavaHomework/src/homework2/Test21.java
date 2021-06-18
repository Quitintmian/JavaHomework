package homework2;

public class Test21 {
	public static void main(String[] args) {
		int [] randowArr = new int[10];
		for (int i = 0; i < 10; i++) {
			randowArr[i] = 	(int)((Math.random() * 9 + 1) * 100); //spawn 100~999
		}
		int max = randowArr[0];
		int min = randowArr[0];
		int sum = 0;
		for (int i = 0; i < randowArr.length; i++) {
			max = max < randowArr[i] ? randowArr[i] : max;
			min = min > randowArr[i] ? randowArr[i] : min;
			sum+=randowArr[i];
		}
		System.out.println(max);
		System.out.println(min);
		System.out.println(sum/10.0);

	}

}
