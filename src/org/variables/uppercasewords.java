package org.variables;

public class uppercasewords {
	public static void main(String[] args) {
		String s=  "HAri123@#$!";
		String upper="",lower="",special="",number="";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int x=c;
			if (x>=65 && x<=90) {
				upper=upper+c;
			}
			else if(x>=97 && x<=122) {
				lower=lower+c;
			}
			else if(x>=48 && x<=57) {
				number=number+c;
			}	
			else{
		         special=special+c;
		} 
	}
			System.out.println("upper count:"+upper);
			System.out.println("lower count:"+lower);
			System.out.println("number count:"+number);
			System.out.println("special count:"+special);
}
}

