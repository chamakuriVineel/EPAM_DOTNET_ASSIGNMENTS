
using System;
class calculator {
    public static int add(int a,int b)
    {
        return a+b;
    }
    public static int sub(int a,int b)
    {
        return a-b;
    }
    public static int mul(int a,int b)
    {
        return a*b;
    }
    public static int div(int a,int b)
    {
        if(b==0)
        {
            Console.WriteLine("Zero is not allowed in the denominator");
            return 404;
        }
        return a/b;
    }
  static void Main()
  {
      Console.WriteLine("***************Welcome To custom calculator***************");
      Console.WriteLine("Operation codes are as follows\nAddition--1\nSubstraction--2\nmultiplication--3\nDivision--4\nExit--5");
      while(true)
      {
          bool end=false;
          Console.WriteLine("Enter first number");
          int a=int.Parse(Console.ReadLine());
          Console.WriteLine("Enter second number");
          int b=int.Parse(Console.ReadLine());
          Console.WriteLine("Enter the desired operation code:");
          int operation =int.Parse(Console.ReadLine());
          switch(operation)
          {
              case 1:
                Console.WriteLine("Result: "+calculator.add(a,b));
                break;
              case 2:
                Console.WriteLine("Result: "+calculator.sub(a,b));
                break;
              case 3:
                Console.WriteLine("Result: "+calculator.mul(a,b));
                break;
              case 4:
                Console.WriteLine("Result: "+calculator.div(a,b));
                break;
              case 5:
                Console.WriteLine("Thank You!");
                end=true;
                break;
              default:
                Console.WriteLine("Enter valid  number");
                break;
          }
          if(end)
            break;
      }
    
  }
}