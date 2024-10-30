package com;

public class Ingredientes {
	
	private String ing1,ing2,ing3;
	
	Ingredientes(){
		
	}

	public Ingredientes(String ing1, String ing2, String ing3) {
		super();
		this.ing1 = ing1;
		this.ing2 = ing2;
		this.ing3 = ing3;
	}

	public String getIng1() {
		return ing1;
	}

	public void setIng1(String ing1) {
		this.ing1 = ing1;
	}

	public String getIng2() {
		return ing2;
	}

	public void setIng2(String ing2) {
		this.ing2 = ing2;
	}

	public String getIng3() {
		return ing3;
	}

	public void setIng3(String ing3) {
		this.ing3 = ing3;
	}

	@Override
	public String toString() {
		return "Ingredientes [ing1=" + ing1 + ", ing2=" + ing2 + ", ing3=" + ing3 + "]";
	}
	
	

}
