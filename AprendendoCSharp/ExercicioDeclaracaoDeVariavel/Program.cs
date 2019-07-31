using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExercicioDeclaracaoDeVariavel
{
    class Program
    {
        static void Main(string[] args)
        {

            double salario = 5000.0;
            bool foiPromovido = true;

            if (salario >= 4000.0)
            {
                foiPromovido = true;
                Console.WriteLine("Seu salário é " + salario + ". Você foi promovido.");
            }
            else
            {
                foiPromovido = false;
                Console.WriteLine("Seu salário é " + salario + ". Você ainda não foi promovido.");
            }



            Console.ReadLine();
        }
    }
}
