package com.restaurant.items;

public class Coffee extends HotDrinks{

	private String name;
	private double cost;
	private int quantity;
	
	public Coffee(String name , double cost) {
		
		this.name = name;
		this.cost = cost;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		
		this.quantity = quantity;
	}
	
	public void setName(String st) {
		
		this.name = st;
		
	}
	
	@Override
	public String getname() {
		// TODO Auto-generated method stub
		return name;
	}
	
	public double getCost() {
		
		return cost;
	}
	
	@Override
	public String toString() {
		
		return name + "   Price = " + cost + " Kolicina = " + quantity;
	}
}
