package com.polymorphism.example; 

/* Polymorphism is a concept where a single work is done in two different ways.
 * Two types of polymorphism : Run time and compile time 
 * Polymorphism can be done by method overloading and method overriding.
 */
public class Bike // parent class 
{
  void run(){  
	System.out.println("THis is a bike");
}
 static class Honda extends Bike { // sub class derives the characteristics of parent class Bike.
	void run() { // overrides the parent class's method run. 
	 System.out.println("This is a honda bike.");}
static class Passion extends Bike { 
	void run () {
		System.out.println("this bike's name is Passion");
	}
}
	
public static void main( String[] args )
{
   //upcasting...: reference variable of Parent class refers to the object of Child class
Bike b = new Honda();
Bike a = new Passion();
b.run(); // calling the run method and through polymorphism the output will be printed after overriding
a.run();  
}
 }}


