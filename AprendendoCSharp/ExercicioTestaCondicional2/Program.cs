using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExercicioTestaCondicional2
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Testando Condicionais 2");

            int idade = 18;
            int quantidadePessoas = 3;
            bool acompanhado = quantidadePessoas >= 2;

            //if (idade >= 18 && quantidadePessoas >= 2)
            if (idade >= 18 && acompanhado)
            {
                Console.WriteLine("Seja bem vindo!");
            }
            else
            {
                Console.WriteLine("Infelizmente você não pode entrar.");
            }

            Console.ReadLine();
        }
    }
}
