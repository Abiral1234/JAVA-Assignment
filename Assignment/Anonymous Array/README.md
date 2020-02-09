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

Example of AnonymousArray :

```javascript 
class AnonymousArray
{
 static void print(int a[])
 {
  for(int i=0;i<a.length;++i)
   System.out.print(a[i]+" ");
 }
 
 static void print(int a[][])
 {
  for(int i=0;i<a.length;++i)
  {
   for(int j=0;j<a[i].length;++j)
    System.out.print(a[i][j]+" ");
 
   System.out.println("");
  }
 }
  
 public static void main(String...s)
 {
  //1d anonymous array 
  print(new int[]{10,20,30,40});
 
  System.out.println("n");
  
  //2d anonymous array 
  print(new int[][]{{10,20},{30,40},{50,60}});  
 }
}
