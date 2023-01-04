package string.programs;

public class CalculateLengthOfStringWithoutDigit {

	public static void main(String[] args) {
		String str="TESTu45";
		str=str.replaceAll("\\d", "");
		int l=str.length();
		System.out.println(l);

	}

}
