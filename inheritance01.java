//Sinbgle level inheritance

package com.k2js.inheritance.practice;

import java.util.Arrays;
import java.util.List;

class A{
	int a=10,b=20;
	
	
	void m(){
		System.out.println("I am from class A  'm' method");
	}
	void n(){
		System.out.println("I am from class A  'n' method");
	}
}
class B extends A{
	int b=400,c=500;
	@Override
	void n(){
		System.out.println(" I am override method 'n' from child class B");
	}
	void o(){
		System.out.println("I am B class method O");
	}
}
class Btest{
	public static void main(String...abc){
		B b1=new B();
		System.out.println(b1.a);
		System.out.println(b1.b);
		System.out.println(b1.c);
		
		b1.m();
		b1.n();
		b1.o();
		
		A a1=new B();
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