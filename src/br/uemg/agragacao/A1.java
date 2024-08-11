package br.uemg.agragacao;

public class A1 {
	@Override
	public String toString() {
		return "A1 [a1=" + a1 + ", a2=" + a2 + "]";
	}

	private int a1;
	private B1 a2;
	
	public A1(B1 b, int a1) {
		this.a1 = a1;
		this.a2 = b;
	}

	public int getA1() {
		return a1;
	}

	public void setA1(int a1) {
		this.a1 = a1;
	}

	public B1 getA2() {
		return a2;
	}

	public void setA2(B1 a2) {
		this.a2 = a2;
	}
}
