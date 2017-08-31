package com.restaurant.items;

import com.restaurant.items.container.Container;

public interface Item {

	int getQuantity();
	
	void setQuantity(int quantity);
	
	String getname();
	
	Category getCategory();
	
	double getCost();
	
	Container getContainer();
}
