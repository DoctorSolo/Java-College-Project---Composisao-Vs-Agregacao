package br.uemg.composicao;

public class A {
	private int a1;
	private B a2;
	
	public A(int b1, int b2, int a1) {
		this.a1 = a1;
		a2 = new B(b1, b2);
	}

	public int getA1() {
		return a1;
	}

	public void setB1(int b1) {
		a2.setB1(b1);
	}
	
	public void setB2(int b2) {
		a2.setB2(b2);
	}

	public B getA2() {
		return a2;
	}

	@Override
	public String toString() {
		return "A [a1=" + a1 + ", a2=" + a2 + "]";
	}

	public void setA2(B a2) {
		this.a2 = a2;
	}
}
