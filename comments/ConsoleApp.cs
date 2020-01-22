using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using CommonMethods;

namespace DOTNET_ASSIGNMENTS
{
    class Program
    {
        static void Main(string[] args)
        {
            ComplexNumber Firstcomplexnumber = new ComplexNumber(2,5);
            ComplexNumber Secondcomplexnumber = new ComplexNumber(-1,8);
            ComplexNumber Resultcomplexnumber = MathLibrary.ComplexAddition(Firstcomplexnumber, Secondcomplexnumber);
            Console.WriteLine("resultant number : "+Resultcomplexnumber);
            Console.ReadLine();

        }
    }
}
