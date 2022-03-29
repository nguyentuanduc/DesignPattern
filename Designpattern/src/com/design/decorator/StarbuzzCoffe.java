package com.design.decorator;

public class StarbuzzCoffe {

	public static void main(String[] args) {
		
		
		
		Beverage beverage = new DarkRoast();
		//beverage = new Mocha(beverage);
		beverage = new Mocha(beverage);
		beverage = new Mocha(beverage);
		
		double cost = beverage.cost();
		
		System.out.println(beverage.getDescription() + " S" + cost);
	}

}
