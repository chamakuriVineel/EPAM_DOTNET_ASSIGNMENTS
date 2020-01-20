using System;
class Solution {
    
  static void Main()
  {
      
    AddressValidator firstInstance=AddressValidator.getInstance();
    AddressValidator secondInstance=AddressValidator.getInstance();
    Console.WriteLine("firstInstance: " + firstInstance.GetHashCode());
    Console.WriteLine("secondInstance: "+secondInstance.GetHashCode());
  }
  
}

class AddressValidator
{
    public static AddressValidator addressValidator;
    //Pincodes stores a list of pincodes
    private AddressValidator()
    {
        //some code to get the data from the database 
    }
    public static  AddressValidator getInstance()
    {
        if(addressValidator==null)
        {
            Console.WriteLine("First Time called");
            addressValidator=new AddressValidator();
        }
        return addressValidator;
    }
}
