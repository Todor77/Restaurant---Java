package com.restaurant.items.container;

public class Cup implements Container{

	@Override
	public String packagingMaterial() {
		
		String material = "plastic";
		
		return material;
	}

}
