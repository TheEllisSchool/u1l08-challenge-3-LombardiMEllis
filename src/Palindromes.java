//Given a string, determine if it is a palindrome. 


public class Palindromes {

	public static void main(String[] args) {
		//take string
		String word = "Madam In Eden Im Adam ";
		word = word.toLowerCase();
		
		//convert to an array of characters
		char [] charArray = word.toCharArray();
		
		/*
		for (int i = 0; i < charArray.length; i++) {
			System.out.println("Array: " + charArray[i]);
		}
		*/
		
		
		int indexBeg = 0;
		int indexEnd = 1;
		boolean palindrome = false;
		do {
			//System.out.println("IndexBeg: " + indexBeg);
			if (charArray[indexBeg] == ' ') {
				indexBeg++;
			}
			if (charArray[charArray.length - indexEnd] == ' ') {
				indexEnd++;
			}
			if (charArray[indexBeg] == charArray[charArray.length - indexEnd]) {
				palindrome = true;
			} else {
				System.out.println("Not a palindrome!");
				break;
			}
			
			indexBeg++;
			indexEnd++;
				
		}while (palindrome == true && indexBeg < charArray.length/2);
		
		if (palindrome) {
			System.out.println("Palindrome!");
		}
		
		
		
		//print to check
		/*
		for (int i = 0; i < charArray.length; i++) {
			System.out.println("Array: " + charArray[i]);
		}
		*/
		
		/*
		//checks single words no spaces
		int count = 0;
		for (int i = 0; i < charArray.length/2; i++) {
			
			if (charArray[i] == charArray[charArray.length - (i + 1)]) {
				count++;
			} else {
				System.out.println(word + " is NOT a palindrome!");
				break;
			}
			
		}
		
		
		if (count == charArray.length/2) {
			System.out.println(word + " is a palindrome!");
		}
		*/
		
		
	}

}
