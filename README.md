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
	// implementation of square abstract method 
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
