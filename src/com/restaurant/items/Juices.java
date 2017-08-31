package com.restaurant.items;


import com.restaurant.items.container.Container;
import com.restaurant.items.container.Glass;
import com.restaurant.items.container.Wrapper;

public class Juices extends ColdDrinks{

	private String name;
	private double cost;
	private int quantity;
	
	public Juices(String name , double cost) {
		
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
		
		Container c = new Glass();
		
		c.packagingMaterial();
	
		return c;
	}

	@Override
	public String toString() {
		
		return name + "   Price = " + cost + " Kolicina = " + quantity;
	}
	
	
}
