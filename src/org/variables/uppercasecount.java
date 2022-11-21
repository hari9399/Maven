package org.variables;

public class uppercasecount {
	public static void main(String[] args) {
		String s= "HAri123@#$!";
		int upper=0,lower=0,special=0,number=0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isUpperCase(c)) {
				upper++;
			}
			else if(Character.isLowerCase(c)) {
				lower++;
			}
			else if(Character.isDigit(c)) {
				number++;
			}	
			else{
			special++;
		} 
	}
			System.out.println("upper count"+upper);
			System.out.println("lower count"+lower);
			System.out.println("number count"+number);
			System.out.println("special count"+special);
}
}
