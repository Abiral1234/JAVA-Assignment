# JAVA-lab
## 1 Anonymous Array
An array is a data structure that stores a collection of homogeneous(same type) values.
An array in Java without any name is anonymous array.
We can create an array without name, such type of nameless arrays are called anonymous array.
The main purpose of anonymous array is just for instant use (just for one time usage) .
Anonymous array is passed as an argument of method
Syntax:
#### anonymous int array 
new int[] { 1, 2, 3, 4};  

#### anonymous char array 
new char[] {'x', 'y', 'z'); 

#### anonymous String array
new String[] {"Geeks", "for", "Geeks"}; 

#### anonymous multidimensional array
new int[][] { {10, 20}, {30, 40, 50} };

## 2 Default Method Interface
Before Java 8, interfaces could have only abstract methods.
The implementation of these methods has to be provided in a separate class.
So, if a new method is to be added in an interface, then its implementation code has to be provided in the class implementing the same interface. 
To overcome this issue, Java 8 has introduced the concept of default methods which allow the interfaces to have methods with implementation without affecting the classes that implement the interface.
#### Example:
// A simple program to Test Interface default 
// methods in java 
interface TestInterface 
{ 
	// abstract method 
	public void square(int a); 

	// default method 
	default void show() 
	{ 
	System.out.println("Default Method Executed"); 
	} 
} 

class TestClass implements TestInterface 
{ 
	
	public void square(int a) 
	{ 
		System.out.println(a*a); 
	} 

	public static void main(String args[]) 
	{ 
		TestClass d = new TestClass(); 
		d.square(4); 

		// default method executed 
		d.show(); 
	} 
}

## 3 Inheritance In Interface
An interface in Java is a blueprint of a class. It has static constants and abstract methods
The interface in Java is a mechanism to achieve abstraction. 
There can be only abstract methods in the Java interface, not method body. 
It is used to achieve abstraction and multiple inheritance in Java.
There are mainly three reasons to use interface. They are given below.
a, It is used to achieve abstraction.
b, By interface, we can support the functionality of multiple inheritance.
c, It can be used to achieve loose coupling

A class implements an interface, but one interface extends another interface.

`interface Printable{  
void print();  
}  
interface Showable extends Printable{  
void show();  
}  
class TestInterface4 implements Showable{  
public void print(){System.out.println("Hello");}  
public void show(){System.out.println("Welcome");}  
  
public static void main(String args[]){  
TestInterface4 obj = new TestInterface4();  
obj.print();  
obj.show();  
 }  
}`
## 4 Nested Interface
An interface i.e. declared within another interface or class is known as nested interface.
The nested interfaces are used to group related interfaces so that they can be easy to maintain.
The nested interface must be referred by the outer interface or class. It can't be accessed directly.
#### Syntax:
interface interface_name{  
 ...  
 interface nested_interface_name{  
  ...  
 }  
}   
#### Example of Nested Interface:
interface Showable{  
  void show();  
  interface Message{  
   void msg();  
  }  
}  
class TestNestedInterface1 implements Showable.Message{  
 public void msg(){System.out.println("Hello nested interface");}  
  
 public static void main(String args[]){  
  Showable.Message message=new TestNestedInterface1();//upcasting here  
  message.msg();  
 }  
}  
## 5 How to create your own exception class
If you are creating your own Exception that is known as custom exception or user-defined exception. Java custom exceptions are used to customize the exception according to user need.

By the help of custom exception, you can have your own exception and message.

Let's see a simple example of java custom exception.
class InvalidAgeException extends Exception{  
 InvalidAgeException(String s){  
  super(s);  
 }  
} 
class TestCustomException1{  
  
   static void validate(int age)throws InvalidAgeException{  
     if(age<18)  
      throw new InvalidAgeException("not valid");  
     else  
      System.out.println("welcome to vote");  
   }  
     
   public static void main(String args[]){  
      try{  
      validate(13);  
      }catch(Exception m){System.out.println("Exception occured: "+m);}  
  
      System.out.println("rest of the code...");  
  }  
}  
## Questions from Chapter 1,2,3:

