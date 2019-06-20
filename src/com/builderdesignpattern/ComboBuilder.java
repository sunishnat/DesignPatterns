package com.builderdesignpattern;

public class ComboBuilder {
	
	public Combo prepareCombo1(){
		
		Combo combo = new Combo();
		combo.addGadget(new Dell());
		combo.addGadget(new Moto());
		return combo;
		
	}
	
	public Combo prepareCombo2(){
		
		Combo combo = new Combo();
		combo.addGadget(new HP());
		combo.addGadget(new Moto());
		return combo;
		
	}
	
	public Combo prepareCombo3(){
		
		Combo combo = new Combo();
		combo.addGadget(new Dell());
		combo.addGadget(new Xiaomi());
		return combo;
		
	}
	
	public Combo prepareCombo4(){
		
		Combo combo = new Combo();
		combo.addGadget(new HP());
		combo.addGadget(new Xiaomi());
		return combo;
		
	}

}
