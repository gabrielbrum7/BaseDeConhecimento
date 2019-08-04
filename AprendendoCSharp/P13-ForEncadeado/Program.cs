using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P13_ForEncadeado
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Projeto 13");

            // *
            // **
            // ***
            // ****
            // *****


            // Escrevendo * com o BREAK.
            for(int contadorLinha = 0; contadorLinha < 10; contadorLinha++)
            {
                for (int contadorColuna = 0; contadorColuna < 10; contadorColuna++)
                {
                    Console.Write("*");
                    if (contadorColuna >= contadorLinha)// Aqui o if só tem uma condição, não precisa abrir chaves.
                        break;
                }
                Console.WriteLine();
            }


            // Uma forma diferente de fazer desenhos de asteriscos.
            for (int contadorLinha = 0; contadorLinha < 10; contadorLinha++)
            {
                for (int contadorColuna = 0; contadorColuna <= contadorLinha; contadorColuna++) // Aqui o for só tem uma condição, não precisa abrir chaves.
                
                    Console.Write("*");
                
                Console.WriteLine();
            }

            Console.ReadLine();
        }
    }
}
