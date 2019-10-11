//Multilevel Inheritance

package com.k2js.inheritance.practice;

interface A{
	int a=10,b=20,c=30;
	
	default void m(){
		System.out.println("I am on A interfac default");
	}
	void n();
	default void o(){
	System.out.println("A interface o()");
	}
	
}
abstract class M2 implements M1{
	int x=100,y=200,c=300;
	
	@Override
	void n(){
		System.out.println("This is override method");
	}
	void a(){
		System.out.println("M2 class a()");
	}
	void b(){
		System.out.println("m2 class B");
	}
}

class M3 extends M2{
	int c=1000, y=2000,a=3000,x=4000,d=5000;
	public void n(){
		
	}
	public void o(){
		
	}
	public void b(){
		
	}
	
	
}

Class M3Test{
	
	public static void main(String...abc){
		M3 m3=new M3();
		System.out.println(m3.a);
		System.out.println(m3.b);
		System.out.println(m3.c);
		System.out.println(m3.x);
		System.out.println(m3.y);
		System.out.println(m3.d);
		
		m3.m();
		m3.n();
		m3.o();
		m3.a();
		m3.b();
		m3.p();
	}
}