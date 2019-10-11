//Sinbgle level inheritance

package com.k2js.inheritance.practice;


interface A{
	int a=10,b=20;
	
	default void m(){
		System.out.println("I am from interface A  'm' method");
	}
	default void n(){
		System.out.println("I am from interface A  'n' method");
	}
}
enum B implements A{
	BOBJ;
	int b=400,c=500;
	public void n(){
		System.out.println(" I am override method 'n' from child class B");
	}
	public void o(){
		System.out.println("I am B class method O");
	}
}
interface Btest{
	public static void main(String...abc){
		
		System.out.println(B.BOBJ.b);
		System.out.println(B.BOBJ.c);
		
		B.BOBJ.m();
		B.BOBJ.n();
		B.BOBJ.o();
		
		// A a1=new B(){};
		// System.out.println(a1.a);
		// System.out.println(a1.b);
		
		// a1.m();
		// a1.n();
	
		
		// B d1=new B(){};
		// System.out.println(d1.a);
		// System.out.println(d1.b);
		
		
		// A e1=new B(){};
		// System.out.println(e1.a);
		// System.out.println(e1.b);


	}
}