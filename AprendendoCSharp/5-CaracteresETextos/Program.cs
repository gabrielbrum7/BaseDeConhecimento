using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _5_CaracteresETextos
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Executando o projeto 5 - Caracteres e textos");

            // character: sempre com aspas simples ''. Texto (string) que é com aspas duplas "".
            char primeiraLetra = 'a';
            Console.WriteLine(primeiraLetra);

            // Isto é um cast e o número respeita a tabela ASCII.
            primeiraLetra = (char)65;
            Console.WriteLine(primeiraLetra);

            primeiraLetra = (char)(primeiraLetra + 1);
            Console.WriteLine(primeiraLetra);

            string titulo = "Alura Cursos de Tecnologia " + 2020;
            string cursosProgramaçao = @" - .NET + 
            - Java + 
            - Javascript";

            Console.WriteLine(titulo);
            Console.WriteLine(cursosProgramaçao);

            // string vazia é permitido. Já o char, não.
            string vazia = "";



            Console.ReadLine();
        }
    }
}
