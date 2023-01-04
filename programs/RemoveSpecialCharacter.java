package string.programs;

public class RemoveSpecialCharacter {

	public static void main(String[] args) {
		String str="vino@# ";
		System.out.println(str.length());
		String str1 = str.replaceAll("[^a-z0-9]", "");
		System.out.println("After removing the special character "+str1);
		System.out.println(str1.length());


	}

}
