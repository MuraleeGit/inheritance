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
interface B extends A{
	int b=400,c=500;
	default void n(){
		System.out.println(" I am override method 'n' from child class B");
	}
	default void o(){
		System.out.println("I am B class method O");
	}
}
interface Btest{
	public static void main(String...abc){
		B b1=new B(){};
		System.out.println(b1.a);
		System.out.println(b1.b);
		System.out.println(b1.c);
		
		b1.m();
		b1.n();
		b1.o();
		
		A a1=new B(){};
		System.out.println(a1.a);
		System.out.println(a1.b);
		
		a1.m();
		a1.n();
	
		
		B d1=new B(){};
		System.out.println(d1.a);
		System.out.println(d1.b);
		
		
		A e1=new B(){};
		System.out.println(e1.a);
		System.out.println(e1.b);


	}
}