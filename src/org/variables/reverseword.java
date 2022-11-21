package org.variables;

public class reverseword {
	public static void main(String[] args) {
		String s = " iah emoclew ot avaj ssalc";
		String op="";
		String[] split = s.split(" ");
		for(String x:split) {
			String rev=x+" ";
			for (int i = rev.length()-1; i >=0; i--) {
				char charAt = rev.charAt(i);
				op=op+charAt;
			}
		}System.out.println(op);
		
	}

}