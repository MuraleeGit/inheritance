//Muiltiple inheritance with interface.

package com.k2js.inheritance.practice;

abstract class A1{
	int a,b,c;
	void m(){
		
	}
	public void n(){};
	abstract void o();
}

interface I1{
	default void p(){
		System.out.println("p() from I intrface");
	}
	void n();
	void a();
}
class A1Child extends A1 implements I1{
	
	@Override
	public void a(){
		System.out.println("I am a() Ovrride method of A1 child");
	}
	void abc(){
		System.out.println("I am child class abc() method");
	}
	void o(){
		
	}
}

class A1Test{
	public static void main(String...abc){
		A1Child a1=new A1Child();
		System.out.println(a1.a)//anonymous class errror
		System.out.println(a1.b);
		System.out.println(a1.c);
		
		a1.m();
		a1.n();
		a1.o();
		a1.p();
		a1.a();
	}
}