package org.variables;

public class pascalconversion {
	public static void main(String[] args) {
		String s = "hai welcome to java class";
		String op=" ";
		String[] split = s.split(" ");
		for(String x:split) {
			char first = x.charAt(0);
			char firstupperCase = Character.toUpperCase(first);
			String remaining = x.substring(1);
			op=op+firstupperCase+remaining+" ";
		}
		System.out.println(op);
		}
	}


 