package com.restaurant.items;

import com.restaurant.items.container.Container;
import com.restaurant.items.container.Glass;

public class ColdDrinks implements Item{

	@Override
	public int getQuantity() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setQuantity(int quantity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getname() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category getCategory() {
		
		Category type = Category.DRINKS;
		return type;
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Container getContainer() {
		
		Container c = new Glass();
		
		return c;
	}

	
}
