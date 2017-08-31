package com.restaurant.orders;

import com.restaurant.items.Item;

public class Order {

	private String name;
	private int quantity;
	
	public Order(String name, int quantity) {
		super();
		this.name = name;
		this.quantity = quantity;
	}
	
	
	public Order(Item item, int quantity){
		
		
		this.name = item.getname();
		this.quantity = quantity;
		
	}
	
	public Order() {
		
		this.name = "";
		this.quantity = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		
		return name + " " + quantity;
	}
	
	
}
