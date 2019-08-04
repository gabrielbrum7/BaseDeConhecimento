using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExercicioLacoDeRepeticaoFor2
{
    class Program
    {
        static void Main(string[] args)
        {
            for (int linha = 0; linha < 10; linha++)
            {

                for (int coluna = 0; coluna <= linha; coluna++)
                {
                    Console.Write("*");// Repare, Write não pula linha.
                }
                Console.WriteLine();
                
                // Abaixo é o mesmo código, só muda as variáveis.
            }

            // Uma forma diferente de fazer desenhos de asteriscos.
            for (int contadorLinha = 0; contadorLinha < 10; contadorLinha++)
            {
                for (int contadorColuna = 0; contadorColuna <= contadorLinha; contadorColuna++) // Aqui o for só tem uma condição, não precisa abrir chaves.

                    Console.Write("*");

                Console.WriteLine();
            }

            //Console.ReadLine();
            Console.ReadLine();
        }
    }
}
