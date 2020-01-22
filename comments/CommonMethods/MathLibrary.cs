using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

/// <summary>
/// This namespace consists of all common methods used in programming. 
/// </summary>
namespace CommonMethods
{
  /// <summary>
  /// This libray is used to find the methods related to mathe,atical operations like addition,multiplication and complex addition etc...s 
  /// </summary>
    public class MathLibrary
    {
        /// <summary>
        /// This method is used to add two integers.
        /// </summary>
        /// <param name="a">
        /// This is of the type integer
        /// </param>
        /// <param name="b">
        /// This is of the type integer
        /// </param>
        /// <returns>
        /// This method returns the integer type.
        /// If the sum of two numbers overflows integer, then it returns the modulo of result with 10^9 +7
        /// </returns>
        public static int Add(int a, int b)
        {
            return a + b;
        }
        /// <summary>
        /// This method is used to multiply two integers.
        /// </summary>
        /// <param name="a">
        /// This is of the type integer
        /// </param>
        /// <param name="b">
        /// This is of the type integer
        /// </param>
        /// <returns>
        /// This method return an integer.
        /// If the product overflows the integer, then it return the modulo of product with the largest prime that can be stored in the integer ie,10^9 +7
        /// </returns>
        public static int multiply(int a, int b)
        {
            int modulus = 1000000007;
            long c;
            c = (a * b * 1L) % modulus;
            return (int)c;
        }
        /// <summary>
        /// This method is used to add two ComplexNumber numbers .
        /// complex numbers is of the type a+bi. Here a is real part and b is imaginary part.
        /// </summary>
        /// <param name="firstNumber">
        /// This should of the type CommonMethods.ComplexNumber
        /// </param>
        /// <param name="secondNumber">
        /// This shhould of the type CommonMethods.ComplexNumber
        /// </param>
        /// <returns>
        /// The return type of this method is of the type CommonMethods.ComplexNunber
        /// </returns>
        public static ComplexNumber ComplexAddition(ComplexNumber firstNumber, ComplexNumber secondNumber)
        {
            return new ComplexNumber(firstNumber.getReal() + secondNumber.getReal(), firstNumber.getImaginary() + secondNumber.getImaginary());
        }

    }
}
