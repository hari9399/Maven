package org.variables;

public class stringpalindrome{
public static void main(String[] args) {
	String s= "madam";
	String rev="";
	for (int i = s.length()-1; i >=0; i--) {
		char c = s.charAt(i);
		rev=rev+c;
	}
	if (rev.equals(s)) {
		System.out.println("palindrome");
	}else {
		System.out.println("not palindrome");
}

}	
}
