package com.builderdesignpattern;

public class TestBuilder {

	public static void main(String[] args) {

		ComboBuilder builder = new ComboBuilder();
		
		Combo combo1 = builder.prepareCombo1();
		System.out.println("Combo 1");
		combo1.showGadgets();
		System.out.println("Bill Amount: " + combo1.getBill());
		
		System.out.println("-----------------------------------");
		
		Combo combo2 = builder.prepareCombo2();
		System.out.println("Combo 2");
		combo2.showGadgets();
		System.out.println("Bill Amount: " + combo2.getBill());
		
		System.out.println("-----------------------------------");
		
		Combo combo3 = builder.prepareCombo3();
		System.out.println("Combo 3");
		combo1.showGadgets();
		System.out.println("Bill Amount: " + combo3.getBill());
		
		System.out.println("-----------------------------------");
		
		Combo combo4 = builder.prepareCombo4();
		System.out.println("Combo 4");
		combo1.showGadgets();
		System.out.println("Bill Amount: " + combo4.getBill());

	}

}
