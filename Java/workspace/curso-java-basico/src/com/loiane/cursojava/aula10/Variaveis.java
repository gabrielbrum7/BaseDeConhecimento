package com.loiane.cursojava.aula10;

public class Variaveis {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int idade = 20;
		String nome = "Gabriel";
		String nomeDoMeuCachorro = "Dog";
		
		//N�o � (conven��o Java) comum usar no Java, mas pode usar:
		
		int _idade;
		int $idade;
		String ano2014;
		
		String nome_do_meu_cachorro;
		String NomeDoMeuCachorro;
	
		idade = 25;
		
		//System.out.println("Idade = " + idade);
		
		//M� pr�tica:
		int x = 10;
		String b = "Gabriel";
		//� importante ter um significado, a vari�vel.
		
		//
		
		//Tipos Primitivos - Vari�veis Aula 11
		
		//*Char*
	
		//
		char a = 97; // 
		//char o = 'o';
		
		//System.out.println(A + ' ' + o);
		//System.out.println(a);
		//
		
		
		//Repare que s�o c�digos decimais da tabela ASCII. Para isso � necess�rio escrever sem aspas simples.
		char o = 111;
		char i = 105;
		
		System.out.println("" + o + i); //Para isso se coloca essa aspas duplas, pois se n�o ele soma os dos valores,
		//veja abaixo:
		System.out.println(o + i);
		//
		
		char interrogacao = 63;
		System.out.println(interrogacao);
		//
		
		//*Boolean*
		boolean verdadeiro = true;
		boolean falso = false;
		
		System.out.println(verdadeiro + " or " + falso);
		//
		
	}

}
