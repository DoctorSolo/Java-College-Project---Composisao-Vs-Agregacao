package br.uemg.app;
import br.uemg.composicao.A;
import br.uemg.composicao.B;

import br.uemg.agragacao.A1;
import br.uemg.agragacao.B1;


public class App {
	public static void main(String[] args) {
		// Composicao
		A aa1 = new A(10, 20, 30);
		System.out.println(aa1);
		
		
		aa1.setB1(99);
		System.out.println(aa1);
		
		
		aa1 = null;
		System.out.println(aa1);
		
		
		// Agregacao
		
		B1 b = new B1(10,20);
		A1 aa2 = new A1(b, 30);
		System.out.println(aa2);
		
		aa2 = null;
		
		System.out.println(b);
	}
}
