package com.learning;

public class demo_oveeloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=1,c=2;
		demo_oveeloading d = new demo_oveeloading();
		d.add(a,b);
		d.add(a, b,c);
	}

	private int add(int a, int b, int c) {
		// TODO Auto-generated method stub
		int d= a+b+c;
		return d;
	}

	private int add(int a,int b) {
		// TODO Auto-generated method stub
		int d=a+b;
		return d;
	}

}
