package com.restaurant.items;

import com.restaurant.items.container.Container;
import com.restaurant.items.container.Wrapper;

public class Sandwich implements Item{

	private int quantity;
	
	@Override
	public int getQuantity() {
		
		return quantity;
	}

	@Override
	public void setQuantity(int quantity) {
		
		this.quantity = quantity;
		
	}

	@Override
	public String getname() {
		
		String name = "Macedonian eat !";
		return name;
	}

	@Override
	public Category getCategory() {
		
		Category type = Category.MAINCOURSE;
		
		return type;
	}

	@Override
	public double getCost() {
		
		return 20.0;
	}

	@Override
	public Container getContainer() {
		
		Container c = new Wrapper();
		
		c.packagingMaterial();
	
		return c;
	}

}
