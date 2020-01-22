using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CommonMethods
{
    /// <summary>
    /// This is custom class to represent the complex numbers in programming .
    /// </summary>
    public class ComplexNumber
    {
        private int real;
        private int imaginary;
        /// <summary>
        /// This is a constructor to create an object of type CommonMethods.ComplexNumber
        /// </summary>
        /// <param name="real">
        /// This should be the real part of the complex number
        /// </param>
        /// <param name="imaginary">
        /// This should be the imaginary part of the complex number
        /// </param>
        public ComplexNumber(int real, int imaginary)
        {
            this.real = real;
            this.imaginary = imaginary;
        }
        /// <summary>
        /// This is used to get the real part of the compex number
        /// </summary>
        /// <returns>
        /// This return type of this method is integer.
        /// </returns>
        public int getReal()
        {
            return real;
        }
        /// <summary>
        /// This is used to get the imaginary part of the compex number
        /// </summary>
        /// <returns>
        /// This return type of this method is integer.
        /// </returns>
        public int getImaginary()
        {
            return imaginary;
        }
        /// <summary>
        /// This is used to get the string version current  compex number
        /// </summary>
        /// <returns>
        /// This return type of this method is String.
        /// </returns>
        override public String ToString()
        {
            String number;
            number = real.ToString() + " + " + imaginary.ToString() + "i";
            return number;
        }
    }
}
