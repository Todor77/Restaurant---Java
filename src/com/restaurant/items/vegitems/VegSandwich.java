package com.restaurant.items.vegitems;

import com.restaurant.items.Category;
import com.restaurant.items.Sandwich;
import com.restaurant.items.container.Container;

public class VegSandwich extends Sandwich{

	private String name;
	private double cost;
	private int quantity;
	
	public VegSandwich(String name, double cost) {
		
		this.name = name;
		this.cost = cost;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		
		this.quantity = quantity;
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
	public Container getContainer() {
		
		return super.getContainer();
	}
	
	@Override
	public Category getCategory() {
		
		Category type = Category.STARTER;
		
		return type;
		//return super.getCategory();
	}
	
	@Override
	public String toString() {
		
		return name + "   Price = " + cost + " Kolicina = "+ quantity;
	}
}
