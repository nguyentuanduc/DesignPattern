package com.design.decorator;

abstract class Beverage {

	String description = "Unkown Beverage";
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
	
}
