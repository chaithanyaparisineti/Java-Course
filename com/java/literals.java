package com.java;

public class literals {

	public static void main(String[] args) {
		//decimal integrals:base 10-->0 to 9
		int a1=10;
		int a2=125;
		System.out.println(a1);
		System.out.println(a2);
		//octal literals:base 8-->0 to 7
		//0 1 2 3-->0+ 1*8^2+ 2*8^1+ 3+8*0
		int a3=0123;
		int a4=0456;
		int a5=0234;
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);
		//Hexa-decimals:base 16-->0 to 9& a-f/A-F
		int a6=0x123;
		int a7=0x456;
		int a8=0xadc;
		int a9=0xbee;
		System.out.println(a6);
		System.out.println(a7);
		System.out.println(a8);
		System.out.println(a9);
		//binary literals:base 2-->0 to 1 values,values starts with 0b to 0B 
		int a10=0b1010;
		int a11=0B101011;
		System.out.println(a10);
		System.out.println(a11);			
	}
}
