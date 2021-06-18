package homework2;

public class Test23 {
	public static void main(String[] args) {
		byte [] hashset = new byte[128]; //ACSII
		String str = "34dkyekoyw";
		for (int i = 0; i < str.length(); i++) {
			hashset[str.charAt(i)]++;
		}
		for (int i = str.length()-1; i >=0; i--) {
			if (hashset[str.charAt(i)] == 2) {
				System.out.println(str.charAt(i));
				break;
			}
		}
	}

}
