package string.programs;

import java.util.HashMap;

public class MatchingCharacterTwoStrings {

	public static void main(String[] args) {
		String str1="abcccdef";
		String str2="dfgterf";
		
		
		char[] arr=str1.toCharArray();
		char[] arr1=str2.toCharArray();
		
		HashMap<Character,Integer> hmap=new HashMap<Character,Integer>();
		HashMap<Character,Integer> hmap1=new HashMap<Character,Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			if(!hmap.containsKey(arr[i])) {
				hmap.put(arr[i],1);	
			}
		}

		for (int i = 0; i < arr1.length; i++) {
			if(!hmap.containsKey(arr1[i])) {
				hmap1.put(arr1[i],1);	
			}
		}
	      System.out.println("Number of matching characters in a pair of Java string is : " + hmap1.size());

	}

}
