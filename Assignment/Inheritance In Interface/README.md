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
