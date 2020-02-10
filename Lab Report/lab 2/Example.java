class Example
{
      private static int var;
      public Example(int num)
      {
             var=num;
      }
      public static void main(String args[])
      {
              Example obj = new Example(2);
              System.out.println("value of var is:"+ var);
      }
}