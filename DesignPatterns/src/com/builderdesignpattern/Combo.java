package com.builderdesignpattern;

import java.util.ArrayList;
import java.util.List;

public class Combo {
	
	List<Gadget> gadgets = new ArrayList<>();
	
	public void addGadget(Gadget gadget){
		
		gadgets.add(gadget);
	}
	
	public int getBill(){
		
		int cost = 0;
		
		for(Gadget gadget : gadgets){
			cost+=gadget.getPrice();
		}
		
		return cost;
	}
	
	public void showGadgets(){
		
		for(Gadget gadget : gadgets){
			System.out.println("Gadget Brand: " + gadget.getBrand());
			System.out.println("Processor: " + gadget.getProcessor().getProcessoBrand());
			System.out.println("Price: " + gadget.getPrice());
		}
	}

}
