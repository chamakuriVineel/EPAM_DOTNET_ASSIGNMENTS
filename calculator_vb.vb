
Module VBModule
    Sub Main()
      Console.WriteLine("***************Welcome To custom calculator***************")
      Console.WriteLine("Operation codes are as follows\nAddition--1\nSubstraction--2\nmultiplication--3\nDivision--4\nExit--5")
      while true
        Dim first_num as Integer 
        Dim second_num as Integer
        Dim operation as Integer
        Dim should_end as Boolean
        Console.WriteLine("Enter te first number")
        should_end=false
        Integer.TryParse(Console.ReadLine(),first_num)
        Console.WriteLine("Enter te second number")
        Integer.TryParse(Console.ReadLine(),second_num)
        Console.WriteLine("Enter the operation code")
        Integer.TryParse(Console.ReadLine(),operation)
        
        Select operation
            case 1:
                Console.WriteLine("Result: " & calculator.addi(first_num,second_num))
            case 2:
                Console.WriteLine("Result: " & calculator.subs(first_num,second_num))
            case 3:
                Console.WriteLine("Result: " & calculator.mul(first_num,second_num))
            case 4:
                Console.WriteLine("Result: " & calculator.div(first_num,second_num))
            case 5:
                Console.WriteLine("Thank You")
                should_end=true
            case else
                Console.WriteLine("Enter valid number")
        end Select
        
        if should_end
            Exit while      
        End if
        
      End while
      
    End Sub
End Module

public class calculator
    
    Public Shared Function addi(ByVal first_num as Integer,ByVal second_num as Integer) as Integer
        return first_num+second_num
    End Function
    
     Public Shared Function subs(ByVal first_num as Integer,ByVal second_num as Integer) as Integer
        return first_num-second_num
    End Function
    
     Public Shared Function mul(ByVal first_num as Integer,ByVal second_num as Integer) as Integer
        return first_num*second_num
    End Function
    
     Public Shared Function div(ByVal first_num as Integer,ByVal second_num as Integer) as Integer
        if second_num=0
           Console.WriteLine("Zero is not included in denominator")
           return 404
        End if
        return first_num/second_num
    End Function
End class