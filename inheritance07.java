//Muiltiple inheritance with interface.

package com.k2js.inheritance.practice;

interface I1{
	int a=10,b=20,c=30;
	
	default void x(){
		System.out.println("X() from I1 interface");
	}
	default void y(){
		System.out.println("Y() from I1 interface");
	}
}
interface I2 extends I1{
	int a=100,b=200,c=300;
	
	default void x(){
		System.out.println("X() from I2 interface");
	}
	default void y(){
		System.out.println("Y() from I2 interface");
	}
}
interface I3 extends I1,I2{
	int x=1000, y=2000;
	@Override
	default void x(){
		System.out.println("x() from overridn in I3 intrface");
	}
	default void y(){
		System.out.println("y() from overriden in I3 interface");
	}
}
interface I{
	public static void main(String...abc){
		I3 i=new I3(){};
		i.x();
		i.y();
		
		I2 i1=new I3(){};
		System.out.println(i1.a);
		
		I1 i2=new I3(){};
		System.out.println(i2.a);
	}
}