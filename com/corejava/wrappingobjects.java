package com.corejava;

public class wrappingobjects {
	String integer="1234";
	String floatin="255.15f";
	String bool="chaithanya";
	char alphabet='c';
	String fullName="chaithanya";
	public static void main(String[] args) {
		wrappingobjects wr =new wrappingobjects();
		int num=Integer.parseInt(wr.integer) + 5678;
		System.out.println(num);
		float num2=Float.parseFloat(wr.floatin)+54.15f;
		System.out.println(num2);
		System.out.println(Boolean.parseBoolean(wr.bool));
		System.out.println(Character.toString(wr.alphabet));
		System.out.println(wr.fullName);
	}

}
